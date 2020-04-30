package com.beitone.medical_store.app.ui.hospital.reservation;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DiseaseListActivity extends BaseActivity {

    @BindView(R.id.layoutSearch)
    LinearLayout layoutSearch;
    @BindView(R.id.flDiseaseContent)
    FrameLayout flDiseaseContent;

    private DiseaseListFragment mDiseaseListFragment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_disease_list;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        mDiseaseListFragment = new DiseaseListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flDiseaseContent ,
                mDiseaseListFragment ).commitAllowingStateLoss();
    }


    @OnClick(R.id.layoutSearch)
    public void onViewClicked() {
    }
}
