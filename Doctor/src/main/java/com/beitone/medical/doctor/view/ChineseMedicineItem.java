package com.beitone.medical.doctor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class ChineseMedicineItem extends LinearLayout {

    public ChineseMedicineItem(Context context) {
        this(context , null);
    }

    public ChineseMedicineItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public ChineseMedicineItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
    }
}
