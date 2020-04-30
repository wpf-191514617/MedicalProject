package com.beitone.medical_store.app.ui.doctor;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DoctorSummrayActivity extends BaseActivity {

    @BindView(R.id.tvDoctorName)
    TextView tvDoctorName;
    @BindView(R.id.tvDoctorJobTitle)
    TextView tvDoctorJobTitle;
    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;
    @BindView(R.id.tvHospitalLevel)
    TextView tvHospitalLevel;
    @BindView(R.id.tvDoctorGoodAt)
    TextView tvDoctorGoodAt;
    @BindView(R.id.tvDoctorEffectiveness)
    TextView tvDoctorEffectiveness;
    @BindView(R.id.tvGoSummary)
    TextView tvGoSummary;
    @BindView(R.id.layoutDoctorSummary)
    LinearLayout layoutDoctorSummary;
    @BindView(R.id.tvGoodAtInfo)
    TextView tvGoodAtInfo;
    @BindView(R.id.tvSummary)
    TextView tvSummary;
    @BindView(R.id.tvLocation)
    TextView tvLocation;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_doctor_summary;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生简介");
        layoutDoctorSummary.setVisibility(View.GONE);
    }

}
