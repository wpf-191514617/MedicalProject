package com.beitone.medical.doctor.ui.user;

import android.widget.ImageView;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserCarteActivity extends BaseActivity {

    @BindView(R.id.civUserAvatar)
    CircleImageView civUserAvatar;
    @BindView(R.id.tvDoctorName)
    TextView tvDoctorName;
    @BindView(R.id.tvDoctorLevel)
    TextView tvDoctorLevel;
    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;
    @BindView(R.id.tvDoctorNumber)
    TextView tvDoctorNumber;
    @BindView(R.id.tvUserCarte)
    ImageView tvUserCarte;
    @BindView(R.id.btnShare)
    AppButton btnShare;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_mine_carte;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("我的名片");
    }


    @OnClick(R.id.btnShare)
    public void onViewClicked() {
    }
}
