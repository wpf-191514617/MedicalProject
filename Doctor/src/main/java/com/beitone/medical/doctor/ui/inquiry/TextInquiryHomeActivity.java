package com.beitone.medical.doctor.ui.inquiry;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.inquiry.fragment.TextInquiryListFragment;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class TextInquiryHomeActivity extends BaseActivity {

    @BindView(R.id.tabInquiryHome)
    TabLayout tabInquiryHome;
    @BindView(R.id.vpInquiry)
    ViewPager vpInquiry;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_text_inquiry_home;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("图文问诊");
        InquiryPagerAdapter pagerAdapter = new InquiryPagerAdapter(getSupportFragmentManager());
        vpInquiry.setAdapter(pagerAdapter);
        tabInquiryHome.setupWithViewPager(vpInquiry);
    }


    class InquiryPagerAdapter extends FragmentPagerAdapter{

        private String[] title = {"待接诊" , "已接诊" , "已完结"};

        public InquiryPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return new TextInquiryListFragment(position);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }

    }

}
