package com.beitone.medical_store.app.ui.doctor.window;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.beitone.medical_store.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.widget.BasePopupWindow;

public class ScreenWindow extends BasePopupWindow {

    @BindView(R.id.tvThreeHospital)
    TextView tvThreeHospital;
    @BindView(R.id.tvSecondHospital)
    TextView tvSecondHospital;
    @BindView(R.id.tvInquiryType1)
    TextView tvInquiryType1;
    @BindView(R.id.tvInquiryType2)
    TextView tvInquiryType2;
    @BindView(R.id.tvInquiryType3)
    TextView tvInquiryType3;
    @BindView(R.id.tvDoctorType1)
    TextView tvDoctorType1;
    @BindView(R.id.tvDoctorType2)
    TextView tvDoctorType2;
    @BindView(R.id.tvDoctorType3)
    TextView tvDoctorType3;
    @BindView(R.id.btnReset)
    Button btnReset;
    @BindView(R.id.btnCommit)
    Button btnCommit;
    @BindView(R.id.v_outside)
    View vOutside;

    private OnScreenCallback mOnScreenCallback;

    private List<String> hospitalLevel;
    private int mInquiryType;
    private List<String> doctorLevel;

    public ScreenWindow(Context context, OnScreenCallback onScreenCallback) {
        super(context);
        mOnScreenCallback = onScreenCallback;
        hospitalLevel = new ArrayList<>();
        mInquiryType = 0;
        doctorLevel = new ArrayList<>();
    }

    @Override
    public View initView() {
        View contentView =
                LayoutInflater.from(getContext()).inflate(R.layout.layout_screen_window, null);
        ButterKnife.bind(this , contentView);
        return contentView;
    }

    @OnClick({R.id.tvThreeHospital, R.id.tvSecondHospital, R.id.tvInquiryType1,
            R.id.tvInquiryType2, R.id.tvInquiryType3, R.id.tvDoctorType1, R.id.tvDoctorType2,
            R.id.tvDoctorType3, R.id.btnReset, R.id.btnCommit, R.id.v_outside})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvThreeHospital:
                tvThreeHospital.setSelected(!tvThreeHospital.isSelected());
                String threeHospital = tvThreeHospital.getText().toString();
                if (tvThreeHospital.isSelected()) {
                    hospitalLevel.add(threeHospital);
                } else {
                    if (hospitalLevel.contains(threeHospital)) {
                        hospitalLevel.remove(threeHospital);
                    }
                }
                break;
            case R.id.tvSecondHospital:
                tvSecondHospital.setSelected(!tvSecondHospital.isSelected());
                String secondHospital = tvSecondHospital.getText().toString();
                if (tvSecondHospital.isSelected()) {
                    hospitalLevel.add(secondHospital);
                } else {
                    if (hospitalLevel.contains(secondHospital)) {
                        hospitalLevel.remove(secondHospital);
                    }
                }
                break;
            case R.id.tvInquiryType1:
                tvInquiryType1.setSelected(!tvInquiryType1.isSelected());
                tvInquiryType2.setSelected(false);
                tvInquiryType3.setSelected(false);
                if (tvInquiryType1.isSelected()) {
                    mInquiryType = 1;
                } else {
                    mInquiryType = 0;
                }
                break;
            case R.id.tvInquiryType2:
                tvInquiryType1.setSelected(false);
                tvInquiryType2.setSelected(!tvInquiryType2.isSelected());
                tvInquiryType3.setSelected(false);
                if (tvInquiryType2.isSelected()) {
                    mInquiryType = 2;
                } else {
                    mInquiryType = 0;
                }
                break;
            case R.id.tvInquiryType3:
                tvInquiryType1.setSelected(false);
                tvInquiryType2.setSelected(false);
                tvInquiryType3.setSelected(!tvInquiryType3.isSelected());
                if (tvDoctorType3.isSelected()) {
                    mInquiryType = 3;
                } else {
                    mInquiryType = 0;
                }
                break;
            case R.id.tvDoctorType1:
                tvDoctorType1.setSelected(!tvDoctorType1.isSelected());
                String dco1 = tvDoctorType1.getText().toString();
                if (tvDoctorType1.isSelected()){
                    doctorLevel.add(dco1);
                } else {
                    if (doctorLevel.contains(dco1)){
                        doctorLevel.remove(dco1);
                    }
                }
                break;
            case R.id.tvDoctorType2:
                tvDoctorType2.setSelected(!tvDoctorType2.isSelected());
                String dco2 = tvDoctorType2.getText().toString();
                if (tvDoctorType2.isSelected()){
                    doctorLevel.add(dco2);
                } else {
                    if (doctorLevel.contains(dco2)){
                        doctorLevel.remove(dco2);
                    }
                }
                break;
            case R.id.tvDoctorType3:
                tvDoctorType3.setSelected(!tvDoctorType3.isSelected());
                String dco3 = tvDoctorType3.getText().toString();
                if (tvDoctorType3.isSelected()){
                    doctorLevel.add(dco3);
                } else {
                    if (doctorLevel.contains(dco3)){
                        doctorLevel.remove(dco3);
                    }
                }
                break;
            case R.id.btnReset:
                tvThreeHospital.setSelected(false);
                tvSecondHospital.setSelected(false);
                tvInquiryType1.setSelected(false);
                tvInquiryType2.setSelected(false);
                tvInquiryType3.setSelected(false);
                tvDoctorType1.setSelected(false);
                tvDoctorType2.setSelected(false);
                tvDoctorType3.setSelected(false);
                break;
            case R.id.btnCommit:
                if (mOnScreenCallback != null){
                    mOnScreenCallback.onScreen(getString(hospitalLevel) , mInquiryType,
                            getString(doctorLevel));
                }
                dismiss();
                break;
            case R.id.v_outside:
                dismiss();
                break;
        }
    }

    public String getString(List<String> stringList){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stringList) {
            stringBuilder.append(s).append(",");
        }
       return stringBuilder.substring(0 , stringBuilder.length()-1);
    }


    public interface OnScreenCallback {
        void onScreen(String hospitalLevel, int inquiryType, String docLevel);
    }

}
