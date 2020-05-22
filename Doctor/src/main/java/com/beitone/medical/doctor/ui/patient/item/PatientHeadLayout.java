package com.beitone.medical.doctor.ui.patient.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical.doctor.R;

public class PatientHeadLayout extends LinearLayout {

    public PatientHeadLayout(Context context) {
        this(context , null);
    }

    public PatientHeadLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public PatientHeadLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_patient_head, this);
    }

}
