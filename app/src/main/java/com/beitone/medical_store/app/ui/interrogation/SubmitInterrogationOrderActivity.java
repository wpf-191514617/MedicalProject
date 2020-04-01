package com.beitone.medical_store.app.ui.interrogation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class SubmitInterrogationOrderActivity extends BaseActivity {

    @BindView(R.id.tvInterrogationName)
    TextView tvInterrogationName;
    @BindView(R.id.tvInterrogationPrice)
    TextView tvInterrogationPrice;
    @BindView(R.id.tvDiscount)
    TextView tvDiscount;
    @BindView(R.id.ivDiscount)
    ImageView ivDiscount;
    @BindView(R.id.tvCoupon)
    TextView tvCoupon;
    @BindView(R.id.ivCoupon)
    ImageView ivCoupon;
    @BindView(R.id.ivWechatPay)
    ImageView ivWechatPay;
    @BindView(R.id.layoutWechatPay)
    LinearLayout layoutWechatPay;
    @BindView(R.id.ivSystemPay)
    ImageView ivSystemPay;
    @BindView(R.id.layoutSystemPay)
    LinearLayout layoutSystemPay;
    @BindView(R.id.ivAliPay)
    ImageView ivAliPay;
    @BindView(R.id.layoutAliPay)
    LinearLayout layoutAliPay;
    @BindView(R.id.tvTotalPrice)
    TextView tvTotalPrice;
    @BindView(R.id.tvPay)
    TextView tvPay;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_submit_interrogationorder;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        ivWechatPay.setSelected(true);
        setTitle("问诊订单");
    }


    @OnClick({R.id.layoutWechatPay, R.id.layoutSystemPay, R.id.layoutAliPay, R.id.tvPay})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutWechatPay:
                ivWechatPay.setSelected(true);
                ivSystemPay.setSelected(false);
                ivAliPay.setSelected(false);
                break;
            case R.id.layoutSystemPay:
                ivWechatPay.setSelected(false);
                ivSystemPay.setSelected(true);
                ivAliPay.setSelected(false);
                break;
            case R.id.layoutAliPay:
                ivWechatPay.setSelected(false);
                ivSystemPay.setSelected(false);
                ivAliPay.setSelected(true);
                break;
            case R.id.tvPay:
                break;
        }
    }
}
