package com.beitone.medical_store.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;

import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class AppCheckBox extends LinearLayout implements View.OnClickListener {

    private TextView tvCheckBox;
    private ImageView ivCheckBox;

    public AppCheckBox(Context context) {
        this(context, null);
    }

    public AppCheckBox(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AppCheckBox(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.AppCheckBox);
        String text = array.getString(R.styleable.AppCheckBox_text);
        array.recycle();
        View view = LayoutInflater.from(context).inflate(R.layout.layout_checkbox, this);
        tvCheckBox = view.findViewById(R.id.tvCheckBox);
        ivCheckBox = view.findViewById(R.id.ivCheckBox);
        //setOnClickListener(this);
        if (!StringUtil.isEmpty(text)) {
            tvCheckBox.setText(text);
        }
    }

    @Override
    public void onClick(View view) {
        //ivCheckBox.setSelected(!ivCheckBox.isSelected());
    }

    public boolean isChecked() {
        return ivCheckBox.isSelected();
    }

    public void setChecked(boolean isChecked) {
        ivCheckBox.setSelected(isChecked);
    }

}
