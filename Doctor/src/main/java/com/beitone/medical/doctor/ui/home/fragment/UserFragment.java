package com.beitone.medical.doctor.ui.home.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.evaluation.EvaluationListActivity;
import com.beitone.medical.doctor.ui.patient.PatientListActivity;
import com.beitone.medical.doctor.ui.user.IntroductionEditActivity;
import com.beitone.medical.doctor.ui.user.RevenueActivity;
import com.beitone.medical.doctor.ui.user.UserCarteActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserFragment extends BaseFragment {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.layoutMinePatient)
    LinearLayout layoutMinePatient;
    @BindView(R.id.layoutMineInCome)
    LinearLayout layoutMineInCome;
    @BindView(R.id.layoutMineFunction)
    LinearLayout layoutMineFunction;
    @BindView(R.id.layoutMineEvaluation)
    LinearLayout layoutMineEvaluation;
    @BindView(R.id.layoutMineSetting)
    LinearLayout layoutMineSetting;
    @BindView(R.id.civDoctorAvatar)
    CircleImageView civDoctorAvatar;
    @BindView(R.id.tvDoctorName)
    TextView tvDoctorName;
    @BindView(R.id.layoutDoctorStatus)
    LinearLayout layoutDoctorStatus;
    @BindView(R.id.tvDoctorHospital)
    TextView tvDoctorHospital;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initViewAndData() {
        setText(tvTitle, "个人中心");
    }

    @OnClick({R.id.layoutMinePatient, R.id.layoutMineInCome, R.id.layoutMineFunction,
            R.id.layoutMineEvaluation, R.id.layoutMineSetting, R.id.layoutUserCode,
            R.id.civDoctorAvatar, R.id.tvDoctorName, R.id.layoutDoctorStatus,
            R.id.tvDoctorHospital})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutUserCode:
                jumpTo(UserCarteActivity.class);
                break;
            case R.id.civDoctorAvatar:
            case R.id.tvDoctorName:
            case R.id.layoutDoctorStatus:
            case R.id.tvDoctorHospital:
                jumpTo(IntroductionEditActivity.class);
                break;
            case R.id.layoutMinePatient:
                jumpTo(PatientListActivity.class);
                break;
            case R.id.layoutMineInCome:
                jumpTo(RevenueActivity.class);
                break;
            case R.id.layoutMineFunction:
                break;
            case R.id.layoutMineEvaluation:
                jumpTo(EvaluationListActivity.class);
                break;
            case R.id.layoutMineSetting:
                break;
        }
    }

}
