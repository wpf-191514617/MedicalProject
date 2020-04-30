package com.beitone.medical_store.app.ui.doctor.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;

public class InterviewItem extends LinearLayout {

    private View viewDivier;

    public InterviewItem(Context context) {
        this(context, null);
    }

    public InterviewItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public InterviewItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_interview , this);
        viewDivier = view.findViewById(R.id.viewDivier);
    }


    public void hideDivierView(){
        viewDivier.setVisibility(View.GONE);
    }

}
