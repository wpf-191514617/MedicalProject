package com.beitone.medical_store.app.ui.user;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.view.AppDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class ReservationDetailActivity extends BaseActivity {

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
    @BindView(R.id.tvOrderCancel)
    TextView tvOrderCancel;
    @BindView(R.id.layoutCancelOrderStatus)
    LinearLayout layoutCancelOrderStatus;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reservation_detail;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("预约详情");
        layoutDoctorSummary.setVisibility(View.GONE);
    }


    @OnClick(R.id.tvOrderCancel)
    public void onViewClicked() {
        AppDialog appDialog = new AppDialog.Builder(this)
                .setTitle("提示")
                .setMessage("是否取消该订单？")
                .setNative("手抖了，不取消", null)
                .setPositive("取消订单", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showStatus();
                    }
                }).build();
        appDialog.show();
    }

    private void showStatus() {
        layoutCancelOrderStatus.setVisibility(View.VISIBLE);
        tvOrderCancel.setVisibility(View.GONE);
    }


}
