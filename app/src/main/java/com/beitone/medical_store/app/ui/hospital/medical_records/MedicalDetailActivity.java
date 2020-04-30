package com.beitone.medical_store.app.ui.hospital.medical_records;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.medical_records.fragment.ReportFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class MedicalDetailActivity extends BaseActivity {

    @BindView(R.id.tabMedical)
    TabLayout tabMedical;
    @BindView(R.id.app_barlayout)
    AppBarLayout appBarlayout;
    @BindView(R.id.medicalPager)
    ViewPager medicalPager;
    @BindView(R.id.containerMedicalDetail)
    CoordinatorLayout containerMedicalDetail;

    private MedicalPagerAdapter medicalPagerAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_detail;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("就诊详情");
        medicalPager.setOffscreenPageLimit(3);
        medicalPagerAdapter = new MedicalPagerAdapter(getSupportFragmentManager());
        medicalPager.setAdapter(medicalPagerAdapter);
        tabMedical.setupWithViewPager(medicalPager);
    }



    class MedicalPagerAdapter extends FragmentPagerAdapter{

        MedicalPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return new ReportFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "电子病历";
                case 1:
                    return "检验报告";
                default:
                    return "检查报告";
            }
        }
    }

}
