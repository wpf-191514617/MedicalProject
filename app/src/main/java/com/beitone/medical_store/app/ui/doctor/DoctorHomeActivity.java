package com.beitone.medical_store.app.ui.doctor;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.fragment.DocHomeFragment;
import com.beitone.medical_store.app.ui.interrogation.SubmitInterrogationOrderActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DoctorHomeActivity extends BaseActivity {


    @BindView(R.id.flDocHomeContent)
    FrameLayout flDocHomeContent;
    @BindView(R.id.tvSeeDoctor)
    TextView tvSeeDoctor;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_doctor_home;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生主页");
        getSupportFragmentManager().beginTransaction().add(R.id.flDocHomeContent,
                new DocHomeFragment()).commitAllowingStateLoss();
    }


    @OnClick(R.id.tvSeeDoctor)
    public void onViewClicked() {
        jumpTo(SubmitInterrogationOrderActivity.class);
    }
}
