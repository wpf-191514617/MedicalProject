package com.beitone.medical_store.app.ui.hospital.reservation;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.reservation.item.ReservationPhoneDialog;
import com.beitone.medical_store.app.ui.interrogation.SelectSeeDoctorPeopleActivity;
import com.beitone.medical_store.app.widget.InputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class ReservationOrderActivity extends BaseActivity {

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
    @BindView(R.id.inputAllergens)
    InputLayout inputAllergens;
    @BindView(R.id.inputPhone)
    InputLayout inputPhone;
    @BindView(R.id.inputDisease)
    InputLayout inputDisease;
    @BindView(R.id.tvReservation)
    TextView tvReservation;

    private final int REQUEST_SELECT_PEOPLE = 1;
    private final int REQUEST_SELECT_DISEASE = 2;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reservation_order;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        layoutDoctorSummary.setVisibility(View.GONE);
        setTitle("预约订单");
        inputAllergens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putBoolean(SelectSeeDoctorPeopleActivity.KEY_SELECT , true);
                jumpToForResult(SelectSeeDoctorPeopleActivity.class, REQUEST_SELECT_PEOPLE, bundle);
            }
        });
        inputPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ReservationPhoneDialog(ReservationOrderActivity.this).show();
            }
        });
        inputDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpToForResult(DiseaseListActivity.class , REQUEST_SELECT_DISEASE);
            }
        });
    }

    @OnClick(R.id.tvReservation)
    public void onViewClicked() {
        jumpToThenKill(ReservationSuccessActivity.class);
    }
}
