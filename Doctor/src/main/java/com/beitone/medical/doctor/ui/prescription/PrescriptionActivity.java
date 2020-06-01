package com.beitone.medical.doctor.ui.prescription;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.prescription.fragment.ChineseMedicineFragment;
import com.beitone.medical.doctor.ui.prescription.fragment.WesternMedicineFragment;
import com.beitone.medical.doctor.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class PrescriptionActivity extends BaseActivity {

    public static final String KEY_PRESCRIPTION_TYPE = "key.prescription.type";

    private boolean isWesternMedicine = true;

    @BindView(R.id.flPrescription)
    FrameLayout flPrescription;
    @BindView(R.id.btnSavePrescription)
    AppButton btnSavePrescription;

    private BaseFragment medicineFragment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_prescription;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        isWesternMedicine = extras.getBoolean(KEY_PRESCRIPTION_TYPE, true);
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        if (isWesternMedicine) {
            setTitle("西药处方");
            medicineFragment = new WesternMedicineFragment();
        } else {
            setTitle("中药处方");
            medicineFragment = new ChineseMedicineFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .add(R.id.flPrescription, medicineFragment).commitNowAllowingStateLoss();
    }

    @OnClick(R.id.btnSavePrescription)
    public void onViewClicked() {
    }
}
