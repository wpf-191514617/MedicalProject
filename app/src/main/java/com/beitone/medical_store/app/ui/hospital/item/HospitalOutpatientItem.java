package com.beitone.medical_store.app.ui.hospital.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.medical_records.MedicalRecordsActivity;
import com.beitone.medical_store.app.ui.hospital.payment.PaymentListActivity;
import com.beitone.medical_store.app.ui.hospital.reservation.DoctorListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HospitalOutpatientItem extends LinearLayout {

    @BindView(R.id.layoutRegistered)
    LinearLayout layoutRegistered;
    @BindView(R.id.layoutPayment)
    LinearLayout layoutPayment;
    @BindView(R.id.layoutMedicalRecords)
    LinearLayout layoutMedicalRecords;
    @BindView(R.id.layoutElectronicPrescription)
    LinearLayout layoutElectronicPrescription;

    public HospitalOutpatientItem(Context context) {
        this(context, null);
    }

    public HospitalOutpatientItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HospitalOutpatientItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_hoapital1, this);
        ButterKnife.bind(contentView);
    }

    @OnClick({R.id.layoutRegistered, R.id.layoutPayment, R.id.layoutMedicalRecords,
            R.id.layoutElectronicPrescription})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutRegistered:
                getContext().startActivity(new Intent(getContext() , DoctorListActivity.class));
                break;
            case R.id.layoutPayment:
                getContext().startActivity(new Intent(getContext() , PaymentListActivity.class));
                break;
            case R.id.layoutMedicalRecords:
                getContext().startActivity(new Intent(getContext() , MedicalRecordsActivity.class));
                break;
            case R.id.layoutElectronicPrescription:
                break;
        }
    }
}
