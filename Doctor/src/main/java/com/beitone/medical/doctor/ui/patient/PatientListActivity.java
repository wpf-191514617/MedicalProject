package com.beitone.medical.doctor.ui.patient;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical.doctor.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class PatientListActivity extends BaseActivity {
    @BindView(R.id.tvDepartment)
    TextView tvDepartment;
    @BindView(R.id.ivDepartment)
    ImageView ivDepartment;
    @BindView(R.id.layoutDepartment)
    LinearLayout layoutDepartment;
    @BindView(R.id.tvSort)
    TextView tvSort;
    @BindView(R.id.ivSort)
    ImageView ivSort;
    @BindView(R.id.layoutSort)
    LinearLayout layoutSort;
    @BindView(R.id.tvFilter)
    TextView tvFilter;
    @BindView(R.id.ivFilter)
    ImageView ivFilter;
    @BindView(R.id.layoutFilter)
    LinearLayout layoutFilter;
    @BindView(R.id.flPatientContent)
    FrameLayout flPatientContent;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_patient_list;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("患者管理");
        getSupportFragmentManager().beginTransaction().add(R.id.flPatientContent ,
                new PatientListFragment()).commitNowAllowingStateLoss();
    }

}
