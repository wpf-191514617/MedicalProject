package com.beitone.medical_store.app.ui.home.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;

public class DrugStoreItem extends LinearLayout {

    public DrugStoreItem(Context context) {
        this(context , null);
    }

    public DrugStoreItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public DrugStoreItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_home_drugstore,this);
    }

}
