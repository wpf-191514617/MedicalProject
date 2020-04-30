package com.beitone.medical_store.app.ui.hospital.medical_card;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.widget.AppCheckBox;
import com.beitone.medical_store.app.widget.InputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class MedicalCardDetailActivity extends BaseActivity {

    @BindView(R.id.tvPersonCardNumber)
    TextView tvPersonCardNumber;
    @BindView(R.id.tvPersonCardChange)
    TextView tvPersonCardChange;
    @BindView(R.id.layoutPersonCard)
    LinearLayout layoutPersonCard;
    @BindView(R.id.tvBindPerson)
    TextView tvBindPerson;
    @BindView(R.id.tvHospitalizedNumber)
    TextView tvHospitalizedNumber;
    @BindView(R.id.tvHospitalizedChange)
    TextView tvHospitalizedChange;
    @BindView(R.id.layoutHospitalized)
    LinearLayout layoutHospitalized;
    @BindView(R.id.tvBindHospitalized)
    TextView tvBindHospitalized;
    @BindView(R.id.cbMan)
    AppCheckBox cbMan;
    @BindView(R.id.cbWomen)
    AppCheckBox cbWomen;
    @BindView(R.id.inputBirthDay)
    InputLayout inputBirthDay;
    @BindView(R.id.inputPhone)
    InputLayout inputPhone;
    @BindView(R.id.inputCity)
    InputLayout inputCity;
    @BindView(R.id.inputDetailAddress)
    InputLayout inputDetailAddress;

    private final int REQUEST_BIND_CARD = 10;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_card_detail;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("就诊人详情");
    }


    @OnClick({R.id.tvPersonCardChange, R.id.tvBindPerson, R.id.tvHospitalizedChange,
            R.id.tvBindHospitalized, R.id.cbMan, R.id.cbWomen, R.id.btnSave, R.id.btnRemove})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvPersonCardChange:
                break;
            case R.id.tvBindPerson:
                jumpToForResult(BindCardActivity.class, REQUEST_BIND_CARD);
                break;
            case R.id.tvHospitalizedChange:
                break;
            case R.id.tvBindHospitalized:
                break;
            case R.id.cbMan:
                break;
            case R.id.cbWomen:
                break;
            case R.id.btnSave:
                break;
            case R.id.btnRemove:
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            switch (requestCode){
                case REQUEST_BIND_CARD:
                    layoutPersonCard.setVisibility(View.VISIBLE);
                    tvBindPerson.setVisibility(View.GONE);
                    break;
            }
        }
    }
}
