package com.beitone.medical_store.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;

public class VisitingPeopleView extends LinearLayout {

    public VisitingPeopleView(Context context) {
        this(context,null);
    }

    public VisitingPeopleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public VisitingPeopleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
       View contentView =LayoutInflater.from(context).inflate(R.layout.layout_visitingpeople ,
               this);
    }

}
