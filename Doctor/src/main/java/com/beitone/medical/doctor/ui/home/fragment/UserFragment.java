package com.beitone.medical.doctor.ui.home.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.UserCarteActivity;
import com.beitone.medical.doctor.ui.evaluation.EvaluationListActivity;
import com.beitone.medical.doctor.ui.patient.PatientListActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

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

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initViewAndData() {
        setText(tvTitle , "个人中心");
    }

    @OnClick({R.id.layoutMinePatient, R.id.layoutMineInCome, R.id.layoutMineFunction,
            R.id.layoutMineEvaluation, R.id.layoutMineSetting, R.id.layoutUserCode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutUserCode:
                jumpTo(UserCarteActivity.class);
                break;
            case R.id.layoutMinePatient:
                jumpTo(PatientListActivity.class);
                break;
            case R.id.layoutMineInCome:
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
