package com.beitone.medical_store.app.ui.user;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class MineReportListActivity extends BaseActivity {

    @BindView(R.id.frameLayout)
    FrameLayout frameLayout;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_framelayout;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("我的报告");
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout ,
                new MineReportListFragment()).commitAllowingStateLoss();
    }


}
