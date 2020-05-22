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
import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class DoctorHomeActivity extends BaseActivity {

    public static final String KEY_DOCTORID = "doctorId";
    public static final String KEY_HOSPITALID = "hospitalId";

    @BindView(R.id.flDocHomeContent)
    FrameLayout flDocHomeContent;
    @BindView(R.id.tvSeeDoctor)
    TextView tvSeeDoctor;

    private String doctorId;
    private String hospitalId;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_doctor_home;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生主页");
        if (!StringUtil.isEmpty(doctorId) && !StringUtil.isEmpty(hospitalId)){
            DocHomeFragment docHomeFragment = new DocHomeFragment(doctorId , hospitalId);
            getSupportFragmentManager().beginTransaction().add(R.id.flDocHomeContent,
                    docHomeFragment).commitAllowingStateLoss();
        }

    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        doctorId = extras.getString(KEY_DOCTORID);
        hospitalId = extras.getString(KEY_HOSPITALID);
    }

    @OnClick(R.id.tvSeeDoctor)
    public void onViewClicked() {
        jumpTo(SubmitInterrogationOrderActivity.class);
    }
}
