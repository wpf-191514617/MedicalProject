package com.beitone.medical.doctor.ui.user;

import android.os.Bundle;
import android.widget.TextView;

import com.beitone.medical.doctor.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class IntroductionPreviewActivity extends BaseActivity {

    @BindView(R.id.tvDoctorName)
    TextView tvDoctorName;
    @BindView(R.id.tvDoctorJobTitle)
    TextView tvDoctorJobTitle;
    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;
    @BindView(R.id.tvHospitalLevel)
    TextView tvHospitalLevel;
    @BindView(R.id.tvSpecialtyContent)
    TextView tvSpecialtyContent;
    @BindView(R.id.tvIntroductionContent)
    TextView tvIntroductionContent;
    @BindView(R.id.tvPracticePointContent)
    TextView tvPracticePointContent;
    @BindView(R.id.tvHospitalLevelContent)
    TextView tvHospitalLevelContent;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_introduction_preview;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生简介");
    }

}
