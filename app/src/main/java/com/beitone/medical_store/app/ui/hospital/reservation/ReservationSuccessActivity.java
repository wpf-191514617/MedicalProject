package com.beitone.medical_store.app.ui.hospital.reservation;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.user.ReservationListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class ReservationSuccessActivity extends BaseActivity {
    @BindView(R.id.tvMoreReservation)
    TextView tvMoreReservation;
    @BindView(R.id.tvInstructions)
    TextView tvInstructions;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reservation_success;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("预约成功");
    }


    @OnClick({R.id.tvMoreReservation, R.id.tvInstructions})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvMoreReservation:
                jumpToThenKill(ReservationListActivity.class);
                break;
            case R.id.tvInstructions:
                break;
        }
    }
}
