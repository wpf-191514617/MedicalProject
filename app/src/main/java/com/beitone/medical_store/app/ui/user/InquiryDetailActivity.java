package com.beitone.medical_store.app.ui.user;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.DoctorHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import de.hdodenhof.circleimageview.CircleImageView;

public class InquiryDetailActivity extends BaseActivity {

    @BindView(R.id.civDoctorAvatar)
    CircleImageView civDoctorAvatar;
    @BindView(R.id.tvDoctorName)
    TextView tvDoctorName;
    @BindView(R.id.tvDoctorLevel)
    TextView tvDoctorLevel;
    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_inquiry_detail;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("问诊详情");
    }


    @OnClick({R.id.layoutDoctor, R.id.layoutPrescription, R.id.layoutChat, R.id.btnGoReferral})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutDoctor:
                jumpTo(DoctorHomeActivity.class);
                break;
            case R.id.layoutPrescription:
                break;
            case R.id.layoutChat:
                break;
            case R.id.btnGoReferral:
                break;
        }
    }
}
