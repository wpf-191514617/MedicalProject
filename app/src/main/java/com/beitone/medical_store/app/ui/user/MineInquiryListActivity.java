package com.beitone.medical_store.app.ui.user;

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

public class MineInquiryListActivity extends BaseActivity {

    @BindView(R.id.tabInquiry)
    TabLayout tabInquiry;
    @BindView(R.id.pagerInquiry)
    ViewPager pagerInquiry;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_mine_inquiry;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("我的问诊");
        pagerInquiry.setOffscreenPageLimit(4);
        InquiryListPagerAdapter inquiryListPagerAdapter =
                new InquiryListPagerAdapter(getSupportFragmentManager());
        pagerInquiry.setAdapter(inquiryListPagerAdapter);
        tabInquiry.setupWithViewPager(pagerInquiry);
    }


    class InquiryListPagerAdapter extends FragmentPagerAdapter{

        String[] titles = {"全部","待接待","已接待","完成"};

        String[] keys = {"" , "1" , "2" , "3"};

        public InquiryListPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return new InquiryListFragment(keys[position]);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }




}
