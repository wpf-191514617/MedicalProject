package com.beitone.medical_store.app.ui.home.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.HospitalServiceActivity;
import com.beitone.medical_store.app.ui.hospital.payment.PaymentListActivity;
import com.beitone.medical_store.app.ui.hospital.report.ReportHomeActivity;
import com.beitone.medical_store.app.ui.hospital.reservation.DoctorListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HospitalServiceItem extends LinearLayout {

    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;
    @BindView(R.id.tvChangeHospital)
    TextView tvChangeHospital;
    @BindView(R.id.tvToHospitalHome)
    TextView tvToHospitalHome;
    @BindView(R.id.layoutRegistered)
    LinearLayout layoutRegistered;
    @BindView(R.id.layoutPayment)
    LinearLayout layoutPayment;
    @BindView(R.id.layoutCheckup)
    LinearLayout layoutCheckup;
    @BindView(R.id.layoutInspection)
    LinearLayout layoutInspection;
    @BindView(R.id.layoutReportCard)
    LinearLayout layoutReportCard;

    public HospitalServiceItem(Context context) {
        this(context, null);
    }

    public HospitalServiceItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HospitalServiceItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_home_hospital, this);
        ButterKnife.bind(contentView);
    }

    @OnClick({R.id.tvChangeHospital, R.id.tvToHospitalHome, R.id.layoutRegistered,
            R.id.layoutPayment, R.id.layoutCheckup, R.id.layoutInspection, R.id.layoutReportCard})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvChangeHospital:
                break;
            case R.id.tvToHospitalHome:
                getContext().startActivity(new Intent(getContext() , HospitalServiceActivity.class));
                break;
            case R.id.layoutRegistered:
                getContext().startActivity(new Intent(getContext() , DoctorListActivity.class));
                break;
            case R.id.layoutPayment:
                getContext().startActivity(new Intent(getContext() , PaymentListActivity.class));
                break;
            case R.id.layoutCheckup:
                break;
            case R.id.layoutInspection:
                break;
            case R.id.layoutReportCard:
                getContext().startActivity(new Intent(getContext() , ReportHomeActivity.class));
                break;
            default:
                break;
        }
    }
}
