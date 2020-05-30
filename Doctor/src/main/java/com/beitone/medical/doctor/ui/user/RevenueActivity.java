package com.beitone.medical.doctor.ui.user;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.beitone.medical.doctor.R;
import com.google.android.material.appbar.AppBarLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.ycbjie.ycstatusbarlib.bar.StateAppBar;
import cn.ycbjie.ycstatusbarlib.utils.StatusBarUtils;

public class RevenueActivity extends BaseActivity {

    @BindView(R.id.appBarLayoutRevenue)
    AppBarLayout appBarLayoutRevenue;
    @BindView(R.id.coordinatorRevenue)
    CoordinatorLayout coordinatorRevenue;
    @BindView(R.id.ivRevenueBack)
    ImageView ivRevenueBack;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvMenuBankCard)
    TextView tvMenuBankCard;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rlRevenue)
    RelativeLayout rlRevenue;
    @BindView(R.id.chartLineView)
    RevenueChartLineView chartLineView;
    @BindView(R.id.charPieView)
    RevenuePieChartView charPieView;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_user_revenue;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        StateAppBar.translucentStatusBar(this, true);
        //状态栏亮色模式，设置状态栏黑色文字、图标
        StatusBarUtils.StatusBarLightMode(this);
        appBarLayoutRevenue.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset == 0) {
                    rlRevenue.setBackgroundColor(Color.argb(0, 255, 255, 255));
                    ivRevenueBack.setImageResource(R.drawable.back);
                    tvTitle.setTextColor(Color.parseColor("#ffffff"));
                    tvMenuBankCard.setTextColor(Color.parseColor("#ffffff"));
                } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                    rlRevenue.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    ivRevenueBack.setImageResource(R.drawable.ic_back);
                    tvTitle.setTextColor(Color.parseColor("#333333"));
                    tvMenuBankCard.setTextColor(Color.parseColor("#333333"));
                    //tvTitle.setTextColor(Color.argb(255, 255, 255, 255));
                    //tvMenuBankCard.setTextColor(Color.argb(255, 255, 255, 255));
                } else {
                    int alpha =
                            (int) (255 - verticalOffset / (float) appBarLayout.getTotalScrollRange() * 255);
                    rlRevenue.setBackgroundColor(Color.argb(alpha, 255, 255, 255));
                }
            }
        });
        chartLineView.setData();
        charPieView.setData();
    }

    @OnClick({R.id.ivRevenueBack, R.id.tvMenuBankCard})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivRevenueBack:
                onBackPressed();
                break;
            case R.id.tvMenuBankCard:
                break;
        }
    }

}
