package com.beitone.medical_store.app.ui.hospital.payment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.beitone.medical_store.app.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class PaymentListActivity extends BaseActivity {

    @BindView(R.id.tabPayment)
    TabLayout tabPayment;
    @BindView(R.id.vpPayment)
    ViewPager vpPayment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_payment_list;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("门诊缴费");
        vpPayment.setOffscreenPageLimit(2);
        vpPayment.setAdapter(new PaymentPagerAdapter(getSupportFragmentManager()));
        tabPayment.setupWithViewPager(vpPayment);
    }


    class PaymentPagerAdapter extends FragmentPagerAdapter{

        PaymentPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return new PaymentListFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return position == 0 ? "待支付" : "已支付";
        }

    }


}
