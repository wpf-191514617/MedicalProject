package com.beitone.medical_store.app.ui.home;

import android.annotation.SuppressLint;

import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.home.item.BannerItem;
import com.beitone.medical_store.app.ui.home.item.DrugStoreItem;
import com.beitone.medical_store.app.ui.home.item.HospitalServiceItem;
import com.beitone.medical_store.app.ui.home.item.QuickEntryItem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.itemBanner)
    BannerItem itemBanner;
    @BindView(R.id.itemQuickEntry)
    QuickEntryItem itemQuickEntry;
    @BindView(R.id.itemHospitalService)
    HospitalServiceItem itemHospitalService;
    @BindView(R.id.itemDrugStore)
    DrugStoreItem itemDrugStore;
    @BindView(R.id.tabHome)
    TabLayout tabHome;
    @BindView(R.id.app_barlayout)
    AppBarLayout appBarlayout;
    @BindView(R.id.homePager)
    ViewPager homePager;
    @BindView(R.id.containerHome)
    CoordinatorLayout containerHome;

    private HomePagerAdapter mHomePagerAdapter;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViewAndData() {
        homePager.setOffscreenPageLimit(8);
        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        homePager.setAdapter(mHomePagerAdapter);
        tabHome.setupWithViewPager(homePager);
    }


    class HomePagerAdapter extends FragmentPagerAdapter {

        private String[] mDepartment = {"发热门诊" , "内科" , "中医科" , "普通外科" ,"神经外科","皮肤科","内科","耳鼻喉科"};


        public HomePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new DoctorListFragment();
        }

        @Override
        public int getCount() {
            return mDepartment.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mDepartment[position];
        }

    }


}
