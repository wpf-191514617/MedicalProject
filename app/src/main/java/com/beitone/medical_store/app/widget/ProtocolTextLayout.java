package com.beitone.medical_store.app.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;

import java.util.HashMap;

public class ProtocolTextLayout extends LinearLayout {

    private AppCheckBox cbProtocol;

    private TextView tvProtocol;

    public ProtocolTextLayout(Context context) {
        this(context,null);
    }

    public ProtocolTextLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ProtocolTextLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_protocoltext ,
                this);
        cbProtocol = contentView.findViewById(R.id.cbProtocol);
        tvProtocol = contentView.findViewById(R.id.tvProtocol);
        cbProtocol.setChecked(true);
        SpannableString string =
                new SpannableString(context.getResources().getString(R.string.protocol_hnit));

        // 用户服务协议
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(context.getResources().getColor(R.color.colorAccent));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 6, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        //  隐私协议
        string.setSpan(new ClickableSpan() {

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(context.getResources().getColor(R.color.colorAccent));
                ds.setAntiAlias(true);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(View view) {
               /* WebEntity webEntity = new WebEntity();
                webEntity.url = WebUrl.USER_AUTH;
                webEntity.head = new HashMap<>();
                Bundle bundle = new Bundle();
                bundle.putParcelable(WebActivity.KEY_WEB, webEntity);
                jumpTo(WebActivity.class, bundle);*/
            }
            // 49，65
        }, 15, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvProtocol.setText(string);
    }



    public boolean isChecked(){
        return cbProtocol.isChecked();
    }

    public View getCheckBox(){
        return cbProtocol;
    }


}
