package com.beitone.medical_store.app.ui.interrogation;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.response.PatientResponse;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.httpentity.PatientAddRequest;
import com.beitone.medical_store.app.httpentity.PatientUpdateRequest;
import com.beitone.medical_store.app.view.SingleSelectDialog;
import com.beitone.medical_store.app.widget.AppButton;
import com.beitone.medical_store.app.widget.AppCheckBox;
import com.beitone.medical_store.app.widget.InputLayout;
import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;
import com.qiniu.android.utils.StringUtils;

import java.util.Arrays;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.DateUtils;
import cn.betatown.mobile.beitonelibrary.util.IDCardUtil;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class HealthArchivesActivity extends BaseActivity {

    @BindView(R.id.inputRelation)
    InputLayout inputRelation;
    @BindView(R.id.inputName)
    InputLayout inputName;
    @BindView(R.id.cbMan)
    AppCheckBox cbMan;
    @BindView(R.id.cbWomen)
    AppCheckBox cbWomen;
    @BindView(R.id.inputIDCard)
    InputLayout inputIDCard;
    @BindView(R.id.inputBirthDay)
    InputLayout inputBirthDay;
    @BindView(R.id.btnSubmit)
    AppButton btnSubmit;

    private SingleSelectDialog mSingleSelectDialog;

    private TimePickerView mTimePickerView;

    private boolean isEdit = false;

    private PatientResponse mPatientResponse;

    private int mSex = 0;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_health_archives;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        if (isEdit) {
            setTitle("编辑健康档案");
            btnSubmit.setText("保存并提交");
        } else {
            setTitle("新增健康档案");
            btnSubmit.setText("创建档案并提交");
        }

        mTimePickerView = new TimePickerBuilder(this, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                try {
                    inputBirthDay.inputContent(DateUtils.formatDate(date));
                } catch (Exception e) {

                }
            }
        }).setSubmitText("确定").setCancelText("取消")
                .setTitleBgColor(Color.parseColor("#ebebeb"))
                .setTitleColor(Color.parseColor("#2177d5")).setTitleText(" ")
                .setSubmitColor(Color.parseColor("#0099de")).setCancelColor(Color.parseColor("#0099de"))
                .setDividerColor(Color.parseColor("#2cb7f6")).setOutSideCancelable(true)//点击外部dismiss default true
                .setLabel("年", "月", "日", "", "", "") //设置空字符串以隐藏单位提示   hide label
                .setDividerColor(Color.parseColor("#e7e7e7")).build();

        inputBirthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTimePickerView.show();
            }
        });

        inputIDCard.getEtInput().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String sex = IDCardUtil.getSex(charSequence.toString());
                String birthDay = IDCardUtil.getBirthday(charSequence.toString());
                if (!StringUtil.isEmpty(sex)){
                    switch (sex){
                        case "男":
                            mSex = 1;
                            cbMan.setChecked(true);
                            cbWomen.setChecked(false);
                            break;
                        case "女":
                            mSex = 2;
                            cbMan.setChecked(false);
                            cbWomen.setChecked(true);
                            break;
                    }
                }

                if (!StringUtil.isEmpty(birthDay) && birthDay.length() > 5){
                    inputBirthDay.inputContent(birthDay);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        inputRelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mSingleSelectDialog == null){
                    mSingleSelectDialog = new SingleSelectDialog(HealthArchivesActivity.this ,
                            Arrays.asList(getResources().getStringArray(R.array.relations)),onSingleSelectListener);
                }
                mSingleSelectDialog.show();
            }
        });

        if (isEdit && mPatientResponse != null){
            inputName.inputContent(mPatientResponse.getPatientName());
            mSex = mPatientResponse.getSex();
            if (mPatientResponse.getSex() == 1){
                cbMan.setChecked(true);
                cbWomen.setChecked(false);
            } else {
                cbMan.setChecked(false);
                cbWomen.setChecked(true);
            }
            inputIDCard.inputContent(mPatientResponse.getIdCard());
            inputBirthDay.inputContent(mPatientResponse.getBirthDate());
        }

    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        isEdit = extras.getBoolean("isEdit");
        mPatientResponse = extras.getParcelable("content");
    }

    @OnClick({R.id.cbMan,  R.id.btnSubmit, R.id.cbWomen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cbMan:
                mSex = 1;
                cbMan.setChecked(true);
                cbWomen.setChecked(false);
                break;
            case R.id.cbWomen:
                mSex = 2;
                cbMan.setChecked(false);
                cbWomen.setChecked(true);
                break;
            case R.id.btnSubmit:
                String name = inputName.getText();
                if (StringUtil.isEmpty(name)){
                    showToast("请输入姓名");
                    return;
                }
                if (mSex == 0){
                    showToast("请选择性别");
                    return;
                }
                String idCard = inputIDCard.getText();
                if (!IDCardUtil.isValid(idCard)){
                    showToast("请输入正确的身份证号码");
                    return;
                }
                String birthDay = inputBirthDay.getText();
                if (StringUtil.isEmpty(birthDay)){
                    showToast("请选择出生日期");
                    return;
                }
                if (isEdit){
                    editInfo(name , idCard , birthDay);
                } else {
                    saveInfo(name , idCard , birthDay);
                }
                break;
        }
    }

    private void saveInfo(String name, String idCard, String birthDay) {
        PatientAddRequest request = new PatientAddRequest();
        request.idCard = idCard;
        request.patientName = name;
        request.sex = mSex;
        request.userId = UserHelper.getInstance().getUserId(this);
        BaseProvider.request(new HttpRequest(request).build(this), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                showToast("添加成功");
                setResult(RESULT_OK);
                finish();
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }
        });
    }

    private void editInfo(String name, String idCard, String birthDay) {
        // TODO 编辑信息
        if (mPatientResponse == null){
            return;
        }

        PatientUpdateRequest request = new PatientUpdateRequest();
        request.addressStr = mPatientResponse.getAddressStr();
        request.idCard = idCard;
        request.patientId = mPatientResponse.getPatientId();
        request.patientName = name;
        request.sex = mSex;
        request.userId = UserHelper.getInstance().getUserId(this);
        BaseProvider.request(new HttpRequest(request).build(this), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                setResult(RESULT_OK);
                finish();
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }
        });
    }

    private SingleSelectDialog.OnSingleSelectListener onSingleSelectListener = new SingleSelectDialog.OnSingleSelectListener() {
        @Override
        public void onSingleSelect(int position, String data) {
            inputRelation.inputContent(data);
        }
    };

}
