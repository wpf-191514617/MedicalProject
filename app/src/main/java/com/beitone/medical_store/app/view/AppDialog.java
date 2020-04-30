package com.beitone.medical_store.app.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.beitone.medical_store.app.R;

import cn.betatown.mobile.beitonelibrary.util.StringUtil;

public class AppDialog extends Dialog {

    private Builder mBuilder;

    private AppDialog(@NonNull Context context , Builder builder) {
        super(context, R.style.ActionSheetDialogStyle);
        this.mBuilder = builder;
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_appdialog , null);
        setContentView(contentView);
        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width =
                context.getResources().getDisplayMetrics().widthPixels -
                        context.getResources().getDimensionPixelSize(R.dimen.dimen_78dp);
        contentView.setLayoutParams(layoutParams);
        getWindow().setGravity(Gravity.CENTER);
        getWindow().setWindowAnimations(R.style.CenterDialog_Animation);
        TextView tvTitle = contentView.findViewById(R.id.tvTitle);
        setText(tvTitle , mBuilder.title);

        TextView tvMsg = contentView.findViewById(R.id.tvMessage);
        if (!TextUtils.isEmpty(mBuilder.message)) {
            tvMsg.setVisibility(View.VISIBLE);
            tvMsg.setText(mBuilder.message);
        } else {
            tvMsg.setVisibility(View.GONE);
        }

        if (mBuilder.messageSpan != null && !TextUtils.isEmpty(mBuilder.messageSpan)) {
            tvMsg.setText(mBuilder.messageSpan);
            tvMsg.setMovementMethod(LinkMovementMethod.getInstance());
            tvMsg.setHighlightColor(Color.TRANSPARENT);
            tvMsg.setVisibility(View.VISIBLE);
        } else {
            if (TextUtils.isEmpty(mBuilder.message))
                tvMsg.setVisibility(View.GONE);
            else
                tvMsg.setVisibility(View.VISIBLE);
        }

        TextView tvNative = contentView.findViewById(R.id.tvNative);
        setText(tvNative , mBuilder.nativeText);
        tvNative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBuilder.onNativeListener != null){
                    mBuilder.onNativeListener.onClick(tvNative);
                }
                    dismiss();

            }
        });

        TextView tvPositive = contentView.findViewById(R.id.tvPositive);
        setText(tvPositive , mBuilder.positiveText);
        tvPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBuilder.onPositiveListener != null){
                    mBuilder.onPositiveListener.onClick(tvPositive);
                }
                    dismiss();

            }
        });

        View lineView = contentView.findViewById(R.id.line);
        if (mBuilder.isOnlyConfrim){
            tvNative.setVisibility(View.GONE);
            lineView.setVisibility(View.GONE);
        }
    }

    private void setText(TextView textView , String text){
        if (StringUtil.isEmpty(text)){
            text = "";
        }
        textView.setText(text);
    }

    public static class Builder{
        private Context context;
        private String title;
        private String message;
        private String positiveText;
        private String nativeText;
        private Spannable messageSpan;
        private boolean isOnlyConfrim = false;
        private View.OnClickListener onPositiveListener, onNativeListener;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder(Context context, String title) {
            this.context = context;
            this.title = title;
        }


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(Spannable messageSpan) {
            this.messageSpan = messageSpan;
            return this;
        }

        public Builder setPositive(String positiveText , View.OnClickListener onPositiveListener){
            this.positiveText= positiveText;
            this.onPositiveListener = onPositiveListener;
            return this;
        }

        public Builder setNative(String nativeText , View.OnClickListener onNativeListener){
            this.nativeText= nativeText;
            this.onNativeListener = onNativeListener;
            return this;
        }

        public Builder setOnlyConfrim(boolean onlyConfrim) {
            this.isOnlyConfrim = onlyConfrim;
            return this;
        }

        public AppDialog build(){
            return new AppDialog(context , this);
        }

    }


}
