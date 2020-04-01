package com.beitone.medical_store.app.ui.interrogation;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.interrogation.fragment.SelectDoctorListFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DoctorListActivity extends BaseActivity {

    @BindView(R.id.tvDepartment)
    TextView tvDepartment;
    @BindView(R.id.ivDepartment)
    ImageView ivDepartment;
    @BindView(R.id.layoutDepartment)
    LinearLayout layoutDepartment;
    @BindView(R.id.tvSort)
    TextView tvSort;
    @BindView(R.id.ivSort)
    ImageView ivSort;
    @BindView(R.id.layoutSort)
    LinearLayout layoutSort;
    @BindView(R.id.tvFilter)
    TextView tvFilter;
    @BindView(R.id.ivFilter)
    ImageView ivFilter;
    @BindView(R.id.layoutFilter)
    LinearLayout layoutFilter;
    @BindView(R.id.flDoctorListContent)
    FrameLayout flDoctorListContent;

    private SelectDoctorListFragment mSelectDoctorListFragment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_doctorlist;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        mSelectDoctorListFragment = new SelectDoctorListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flDoctorListContent,
                mSelectDoctorListFragment).commitAllowingStateLoss();
        setTitle("选医生");
    }

    @OnClick({R.id.layoutDepartment, R.id.layoutSort, R.id.layoutFilter})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutDepartment:
                break;
            case R.id.layoutSort:
                break;
            case R.id.layoutFilter:
                break;
        }
    }


}
