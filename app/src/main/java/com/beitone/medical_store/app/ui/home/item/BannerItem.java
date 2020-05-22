package com.beitone.medical_store.app.ui.home.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.bumptech.glide.Glide;
import com.stx.xhb.xbanner.XBanner;

import java.util.List;

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


    public void setData(List<String> data) {
        itemBanner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(getContext()).load((String) model).centerCrop().into((ImageView) view);
            }
        });
        itemBanner.setData(data , null);
    }
}
