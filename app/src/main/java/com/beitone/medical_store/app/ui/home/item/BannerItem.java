package com.beitone.medical_store.app.ui.home.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.stx.xhb.xbanner.XBanner;

public class BannerItem extends LinearLayout {

    private XBanner itemBanner;

    public BannerItem(Context context) {
        this(context, null);
    }

    public BannerItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BannerItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_banner, this);
        itemBanner = contentView.findViewById(R.id.banner);
    }

}
