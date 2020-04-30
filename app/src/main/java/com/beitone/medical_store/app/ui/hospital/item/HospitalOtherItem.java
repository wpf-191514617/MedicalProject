package com.beitone.medical_store.app.ui.hospital.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.dailylist.DailyListActivity;
import com.beitone.medical_store.app.ui.hospital.report.ReportHomeActivity;
import com.beitone.medical_store.app.ui.user.MineReportListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HospitalOtherItem extends LinearLayout {

    @BindView(R.id.layoutInspection)
    LinearLayout layoutInspection;
    @BindView(R.id.layoutMedicalReport)
    LinearLayout layoutMedicalReport;
    @BindView(R.id.layoutReserveMedical)
    LinearLayout layoutReserveMedical;
    @BindView(R.id.layoutReserveInspection)
    LinearLayout layoutReserveInspection;

    public HospitalOtherItem(Context context) {
        this(context, null);
    }

    public HospitalOtherItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HospitalOtherItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_hoapital3, this);
        ButterKnife.bind(contentView);
    }

    @OnClick({R.id.layoutInspection, R.id.layoutMedicalReport, R.id.layoutReserveMedical,
            R.id.layoutReserveInspection})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutInspection:
                getContext().startActivity(new Intent(getContext() , MineReportListActivity.class));
                break;
            case R.id.layoutMedicalReport:
                getContext().startActivity(new Intent(getContext() , ReportHomeActivity.class));
                break;
            case R.id.layoutReserveMedical:
                break;
            case R.id.layoutReserveInspection:
                break;
        }
    }
}
