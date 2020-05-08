package com.beitone.medical_store.app.ui.interrogation;

import android.Manifest;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.request.ConditionDesRequest;
import com.beitone.medical_store.app.helper.FileUploadHelper;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.provider.QuestionProvider;
import com.beitone.medical_store.app.widget.AppCheckBox;
import com.beitone.medical_store.app.widget.InputLayout;
import com.beitone.medical_store.app.widget.SelectImageLayout;
import com.donkingliang.imageselector.utils.ImageSelector;
import com.donkingliang.imageselector.utils.ImageSelectorUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.permission.Acp;
import cn.betatown.mobile.beitonelibrary.permission.AcpListener;
import cn.betatown.mobile.beitonelibrary.permission.AcpOptions;
import cn.betatown.mobile.beitonelibrary.util.GsonUtil;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class SubmitQuestionActivity extends BaseActivity {

    @BindView(R.id.tvSubmitPrompt)
    TextView tvSubmitPrompt;
    @BindView(R.id.etSubmitQuestion)
    EditText etSubmitQuestion;
    @BindView(R.id.gridImgLayout)
    SelectImageLayout gridImgLayout;
    private final int REQUEST_SELECT_IMAGE = 0x10;
    @BindView(R.id.cbHave)
    AppCheckBox cbHave;
    @BindView(R.id.cbNoHave)
    AppCheckBox cbNoHave;
    @BindView(R.id.inputAllergens)
    InputLayout inputAllergens;
    @BindView(R.id.cbFirstTreat)
    AppCheckBox cbFirstTreat;
    @BindView(R.id.cbSecondTreat)
    AppCheckBox cbSecondTreat;
    @BindView(R.id.tvNext)
    TextView tvNext;

    private String subsequentVisit = "";

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_submit_question;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("快速提问");
        tvSubmitPrompt.setSelected(true);
        int margin = getResources().getDimensionPixelSize(R.dimen.dp_15);
        gridImgLayout.setMargin(margin, margin);
        gridImgLayout.setOnSelectImageListener(new SelectImageLayout.OnSelectImageListener() {
            @Override
            public void onSelectImage() {
                checkImagePermission();
            }
        });
        gridImgLayout.initData(this);
    }

    private void checkImagePermission() {
        Acp.getInstance(this).request(new AcpOptions.Builder().setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE
                , Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA).build(),
                new AcpListener() {
                    @Override
                    public void onGranted() {
                        int size = gridImgLayout.getMaxSelectCount();
                        ImageSelector.builder().useCamera(true) // 设置是否使用拍照
                                .setMaxSelectCount(size)
                                .setViewImage(true) //是否点击放大图片查看,，默认为true
                                .start(SubmitQuestionActivity.this, REQUEST_SELECT_IMAGE); // 打开相册
                    }

                    @Override
                    public void onDenied(List<String> permissions) {
                        showToast("权限拒绝");
                    }
                });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SELECT_IMAGE && resultCode == RESULT_OK) {
            if (data != null) {
                ArrayList<String> images =
                        data.getStringArrayListExtra(ImageSelectorUtils.SELECT_RESULT);
                if (AdapterUtil.isListNotEmpty(images)) {
                    gridImgLayout.addImages(images);
                }
            }
        }
    }

    @OnClick({R.id.cbHave, R.id.cbNoHave, R.id.inputAllergens, R.id.cbFirstTreat,
            R.id.cbSecondTreat, R.id.tvNext})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cbHave:
                cbHave.setChecked(true);
                cbNoHave.setChecked(false);
                inputAllergens.setVisibility(View.VISIBLE);
                break;
            case R.id.cbNoHave:
                cbHave.setChecked(false);
                cbNoHave.setChecked(true);
                inputAllergens.setVisibility(View.GONE);
                break;
            case R.id.inputAllergens:
                jumpToForResult(AllergensListActivity.class , 1);
                break;
            case R.id.cbFirstTreat:
                subsequentVisit = "0";
                cbFirstTreat.setChecked(true);
                cbSecondTreat.setChecked(false);
                break;
            case R.id.cbSecondTreat:
                subsequentVisit = "1";
                cbFirstTreat.setChecked(false);
                cbSecondTreat.setChecked(true);
                break;
            case R.id.tvNext:

                String dec = etSubmitQuestion.getText().toString();
                if (StringUtil.isEmpty(dec)){
                    showToast("请输入病情描述");
                    return;
                }
                if (StringUtil.isEmpty(subsequentVisit)){
                    showToast("请选择是否初诊/复诊");
                    return;
                }
                List<String> imagePaths = gridImgLayout.getImageFiles();
                showLoadingDialog();
                if (AdapterUtil.isListNotEmpty(imagePaths)){
                    compressAndUploadImage(imagePaths);
                } else {
                    commitDec(null);
                }
                break;
        }
    }

    private void compressAndUploadImage(List<String> imagePaths) {
        FileUploadHelper.getInstance(this).compressWithUploadImgs(imagePaths, new FileUploadHelper.OnUploadCallback() {
            @Override
            public void OnUploadComplete(List<String> uploadFile) {
                commitDec(uploadFile);
            }
        });
    }

    private void commitDec(List<String> uploadFile) {
        ConditionDesRequest.QueryParams queryParams = new ConditionDesRequest.QueryParams();
        queryParams.orderType = "1";
        queryParams.symptom = etSubmitQuestion.getText().toString();
        queryParams.userId = UserHelper.getInstance().getUserId(this);
        ConditionDesRequest desRequest = new ConditionDesRequest();
        desRequest.queryParams = queryParams;
        desRequest.allergy = "0";
        desRequest.imgsList = GsonUtil.GsonString(uploadFile);
        desRequest.subsequentVisit = subsequentVisit;
        QuestionProvider.submitConditionDes(this, desRequest, new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                onDismissLoading();
                Trace.d("submit---" + data);
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
                onDismissLoading();
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                onDismissLoading();
                showToast(msg);
            }
        });
    }

}
