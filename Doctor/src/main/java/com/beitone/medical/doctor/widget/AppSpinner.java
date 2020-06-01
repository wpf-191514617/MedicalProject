package com.beitone.medical.doctor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class AppSpinner extends LinearLayout {

    public AppSpinner(Context context) {
        this(context , null);
    }

    public AppSpinner(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public AppSpinner(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {

    }


}
