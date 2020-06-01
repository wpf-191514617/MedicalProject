package com.beitone.medical.doctor.ui.prescription;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.prescription.fragment.WesternMedicineFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class SelectPrescriptionTypeActivity extends BaseActivity {

    @BindView(R.id.layoutWesternMedicine)
    LinearLayout layoutWesternMedicine;
    @BindView(R.id.layoutChineseMedicine)
    LinearLayout layoutChineseMedicine;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_select_prescription_type;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("新增处方单");
    }


    @OnClick({R.id.layoutWesternMedicine, R.id.layoutChineseMedicine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutWesternMedicine:
                Bundle bundle = new Bundle();
                bundle.putBoolean(PrescriptionActivity.KEY_PRESCRIPTION_TYPE , true);
                jumpToThenKill(PrescriptionActivity.class, bundle);
                break;
            case R.id.layoutChineseMedicine:
                Bundle bundle1 = new Bundle();
                bundle1.putBoolean(PrescriptionActivity.KEY_PRESCRIPTION_TYPE , false);
                jumpToThenKill(PrescriptionActivity.class , bundle1);
                break;
        }
    }
}
