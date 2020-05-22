package com.beitone.medical_store.app.ui.doctor;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.SortEntity;
import com.beitone.medical_store.app.entity.response.TreeFloorResponse;
import com.beitone.medical_store.app.httpentity.TreeFloor2Request;
import com.beitone.medical_store.app.ui.doctor.fragment.FindDocListFragment;
import com.beitone.medical_store.app.ui.doctor.fragment.SelectDoctorListFragment;
import com.beitone.medical_store.app.ui.doctor.window.DepartmentWindow;
import com.beitone.medical_store.app.ui.doctor.window.ScreenWindow;
import com.beitone.medical_store.app.ui.doctor.window.SortWindow;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.Trace;

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
    private FindDocListFragment mFindDocListFragment;

    private boolean isFindDoc;

    private DepartmentWindow mDepartmentWindow;
    private SortWindow mSortWindow;
    private ScreenWindow mScreenWindow;

    private List<TreeFloorResponse> mFloorResponseList;


    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_doctorlist;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);

        BaseFragment baseFragment = null;
        if (!isFindDoc){
            baseFragment = new SelectDoctorListFragment();
            mSelectDoctorListFragment = (SelectDoctorListFragment) baseFragment;
            setTitle("选医生");
        } else {
            baseFragment = new FindDocListFragment();
            mFindDocListFragment = (FindDocListFragment) baseFragment;
            setTitle("找医生");
        }
        getSupportFragmentManager().beginTransaction().add(R.id.flDoctorListContent,
                baseFragment).commitAllowingStateLoss();

    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        isFindDoc = extras.getBoolean("isFindDoc" , false);
    }

    @OnClick({R.id.layoutDepartment, R.id.layoutSort, R.id.layoutFilter})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutDepartment:
                tvDepartment.setSelected(true);
                ivDepartment.setSelected(true);
                tvSort.setSelected(false);
                ivSort.setSelected(false);
                tvFilter.setSelected(false);
                ivFilter.setSelected(false);

                if (mDepartmentWindow == null){
                    mDepartmentWindow = new DepartmentWindow(this , selectDepartmentListener);
                    mDepartmentWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                        @Override
                        public void onDismiss() {
                            tvDepartment.setSelected(false);
                            ivDepartment.setSelected(false);
                        }
                    });
                }

                if (AdapterUtil.isListNotEmpty(mFloorResponseList)) {
                    mDepartmentWindow.showAsDropDown(layoutDepartment);
                } else {
                    getTreefloor2();
                }
                break;
            case R.id.layoutSort:
                tvDepartment.setSelected(false);
                ivDepartment.setSelected(false);
                tvSort.setSelected(true);
                ivSort.setSelected(true);
                tvFilter.setSelected(false);
                ivFilter.setSelected(false);

                if (mSortWindow == null){
                    mSortWindow = new SortWindow(this , onSelectSortListener);
                    mSortWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                        @Override
                        public void onDismiss() {
                            tvSort.setSelected(false);
                            ivSort.setSelected(false);
                        }
                    });
                }
                mSortWindow.showAsDropDown(layoutSort);
                break;
            case R.id.layoutFilter:
                tvDepartment.setSelected(false);
                ivDepartment.setSelected(false);
                tvSort.setSelected(false);
                ivSort.setSelected(false);
                tvFilter.setSelected(true);
                ivFilter.setSelected(true);
                if (mScreenWindow == null){
                    mScreenWindow = new ScreenWindow(this , onScreenCallback);
                    mScreenWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                        @Override
                        public void onDismiss() {
                            tvFilter.setSelected(false);
                            ivFilter.setSelected(false);
                        }
                    });
                }
                mScreenWindow.showAsDropDown(layoutFilter);
                break;
        }
    }

    private void getTreefloor2() {
        TreeFloor2Request floor2Request = new TreeFloor2Request();
        BaseProvider.request(new HttpRequest(floor2Request).build(this),
                new OnJsonCallBack<List<TreeFloorResponse>>() {
                    @Override
                    public void onResult(List<TreeFloorResponse> data) {
                        if (!AdapterUtil.isListNotEmpty(data)) {
                            showToast("获取科室数据失败");
                            return;
                        }
                        mFloorResponseList = data;
                        mDepartmentWindow.setFloorResponseList(data);
                        mDepartmentWindow.showAsDropDown(layoutDepartment);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        showToast(msg);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        showToast(msg);
                    }
                });


    }

    private ScreenWindow.OnScreenCallback onScreenCallback = new ScreenWindow.OnScreenCallback() {
        @Override
        public void onScreen(String hospitalLevel, int inquiryType, String docLevel) {
            if (!isFindDoc){
                mSelectDoctorListFragment.setScreenData(hospitalLevel,inquiryType,docLevel);
            } else {
                mFindDocListFragment.setScreenData(hospitalLevel,inquiryType,docLevel);
            }
        }
    };

    private SortWindow.OnSelectSortListener onSelectSortListener = new SortWindow.OnSelectSortListener() {
        @Override
        public void onSort(SortEntity sortType) {
            setText(tvSort , sortType.content);
            if (!isFindDoc){
                mSelectDoctorListFragment.onSort(sortType);
            } else {
                mFindDocListFragment.onSort(sortType);
            }
        }
    };


    private DepartmentWindow.OnSelectDepartmentListener selectDepartmentListener =
            new DepartmentWindow.OnSelectDepartmentListener() {
        @Override
        public void onSelectDepartment(TreeFloorResponse parentEntity, TreeFloorResponse.ChildrenBean child) {
            tvDepartment.setText(child.getDeptName());
            if (!isFindDoc){
                mSelectDoctorListFragment.onSelectDepartment(parentEntity , child);
            } else {
                mFindDocListFragment.onSelectDepartment(parentEntity , child);
            }
        }
    };

}
