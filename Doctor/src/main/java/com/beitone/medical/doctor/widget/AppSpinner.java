package com.beitone.medical.doctor.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.ListPopupWindow;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.view.SingleListWindow;

import java.util.List;

import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class AppSpinner extends LinearLayout {

    private TextView tvSpinner;

    private List<String> mDatas;

    private SingleListWindow listPopupWindow;

    private View contentView;

    private OnItemSelectListener onItemSelectListener;

    public void setOnItemSelectListener(OnItemSelectListener onItemSelectListener) {
        this.onItemSelectListener = onItemSelectListener;
    }

    public AppSpinner(Context context) {
        this(context , null);
    }

    public AppSpinner(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public AppSpinner(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.AppSpinner);
        String textHint = array.getString(R.styleable.AppSpinner_textHint);
        array.recycle();

        contentView = LayoutInflater.from(context).inflate(R.layout.layout_spinner, this);
        tvSpinner = contentView.findViewById(R.id.tvSpinner);
        if (!StringUtil.isEmpty(textHint)) {
            tvSpinner.setHint(textHint);
        }

        setOnClickListener(onClickListener);
    }

    public void setDatas(List<String> datas) {
        this.mDatas = datas;
    }

    public void inputText(String text){
        if (StringUtil.isEmpty(text)){
            text = "";
        }
        tvSpinner.setText(text);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            showPopuWindow();
        }
    };

    private void showPopuWindow() {
        if (listPopupWindow == null) {
            listPopupWindow = new SingleListWindow(getContext(),mDatas, onSingleSelectListener);
        }
        listPopupWindow.setDatas(mDatas);
        listPopupWindow.setWidth(contentView.getWidth());
        listPopupWindow.showAsDropDown(contentView);
    }


    private SingleListWindow.OnSingleSelectListener onSingleSelectListener = new SingleListWindow.OnSingleSelectListener() {
        @Override
        public void onItemSelect(int position, String data) {
            listPopupWindow.dismiss();
            if (onItemSelectListener != null){
                onItemSelectListener.onItemSelect(position , data);
            }
        }
    };

    public interface OnItemSelectListener{
        void onItemSelect(int position , String data);
    }


}
