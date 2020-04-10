package com.beitone.medical_store.app.ui.interrogation;

import android.Manifest;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.widget.SelectImageLayout;
import com.donkingliang.imageselector.utils.ImageSelector;
import com.donkingliang.imageselector.utils.ImageSelectorUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.permission.Acp;
import cn.betatown.mobile.beitonelibrary.permission.AcpListener;
import cn.betatown.mobile.beitonelibrary.permission.AcpOptions;

public class SubmitQuestionActivity extends BaseActivity {

    @BindView(R.id.tvSubmitPrompt)
    TextView tvSubmitPrompt;
    @BindView(R.id.etSubmitQuestion)
    EditText etSubmitQuestion;
    @BindView(R.id.gridImgLayout)
    SelectImageLayout gridImgLayout;
    private final int REQUEST_SELECT_IMAGE = 0x10;

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
                if (AdapterUtil.isListNotEmpty(images))
                    gridImgLayout.addImages(images);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_next) {
            jumpTo(SelectSeeDoctorPeopleActivity.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
