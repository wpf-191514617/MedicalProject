package com.beitone.medical_store.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

import androidx.appcompat.widget.AppCompatButton;

import com.beitone.medical_store.app.R;


public class AppButton extends AppCompatButton {


    public AppButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public AppButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.AppButton);
        String btnText = array.getString(R.styleable.AppButton_btnText);
        boolean btnEnable = array.getBoolean(R.styleable.AppButton_btnEnable, true);
        array.recycle();
        // View view = LayoutInflater.from(context).inflate(R.layout.layout_button , this);
        //button = view.findViewById(R.id.button);
        setBackgroundResource(R.drawable.bg_button);
        setTextColor(getResources().getColor(R.color.white));
        setTextSize(TypedValue.COMPLEX_UNIT_SP , 16);
        if (!TextUtils.isEmpty(btnText)) {
            setText(btnText);
        }
        setSelected(btnEnable);
        setFocusable(btnEnable);
        setClickable(btnEnable);
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        setEnabled(selected);
        setFocusable(selected);
        setClickable(selected);
    }


}
