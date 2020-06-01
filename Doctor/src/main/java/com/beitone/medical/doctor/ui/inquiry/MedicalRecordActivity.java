package com.beitone.medical.doctor.ui.inquiry;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.prescription.SelectPrescriptionTypeActivity;
import com.beitone.medical.doctor.widget.AppButton;
import com.beitone.medical.doctor.widget.InputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class MedicalRecordActivity extends BaseActivity {
    @BindView(R.id.lineTitle)
    View lineTitle;
    @BindView(R.id.inputAppeal)
    InputLayout inputAppeal;
    @BindView(R.id.inputDiagnosis)
    InputLayout inputDiagnosis;
    @BindView(R.id.inputSuggest)
    InputLayout inputSuggest;
    @BindView(R.id.inputAllergy)
    InputLayout inputAllergy;
    @BindView(R.id.tvCreatePrescription)
    TextView tvCreatePrescription;
    @BindView(R.id.btnSavePrescription)
    AppButton btnSavePrescription;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_record;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        lineTitle.setVisibility(View.VISIBLE);
        setTitle("病历与处方");
    }

    @OnClick({R.id.tvCreatePrescription, R.id.btnSavePrescription})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvCreatePrescription:
                jumpTo(SelectPrescriptionTypeActivity.class);
                break;
            case R.id.btnSavePrescription:
                break;
        }
    }
}
