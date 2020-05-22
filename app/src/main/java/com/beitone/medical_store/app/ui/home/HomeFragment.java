package com.beitone.medical_store.app.ui.home;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.response.FloorResponse;
import com.beitone.medical_store.app.entity.response.HospitalResponse;
import com.beitone.medical_store.app.httpentity.BannerListRequest;
import com.beitone.medical_store.app.httpentity.CategoryListRequest;
import com.beitone.medical_store.app.httpentity.HomeHospitalRequest;
import com.beitone.medical_store.app.httpentity.ListFloor1Request;
import com.beitone.medical_store.app.ui.home.item.BannerItem;
import com.beitone.medical_store.app.ui.home.item.DrugStoreItem;
import com.beitone.medical_store.app.ui.home.item.HospitalServiceItem;
import com.beitone.medical_store.app.ui.home.item.QuickEntryItem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

import butterknife.BindView;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class HomeFragment extends BaseFragment {

    private final int REQUEST_LOAD_BANNER = 1;
    private final int REQUEST_LOAD_HOSPITAL = 2;
    private final int REQUEST_LOAD_CATEGORY = 3;
    private final int REQUEST_LOAD_FLOOR = 4;
    private final int REQUEST_LOAD_DOCTOR_LIST = 5;


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

    private HospitalResponse mHospitalResponse;

    private Handler mHandler = new Handler() {
        @SuppressLint("HandlerLeak")
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case REQUEST_LOAD_BANNER:
                    loadBannerData();
                    break;
                case REQUEST_LOAD_HOSPITAL:
                    loadHospitalData();
                    break;
                case REQUEST_LOAD_CATEGORY:
                    loadCategoryData();
                    break;
                case REQUEST_LOAD_FLOOR:
                    getListFloor1();
                    break;
                case REQUEST_LOAD_DOCTOR_LIST:
                    List<FloorResponse> floorList = (List<FloorResponse>) msg.obj;
                    if (AdapterUtil.isListNotEmpty(floorList)) {
                        homePager.setOffscreenPageLimit(floorList.size());
                        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager(),
                                floorList);
                        homePager.setAdapter(mHomePagerAdapter);
                        tabHome.setupWithViewPager(homePager);
                    }
                    break;
            }
        }
    };

    private void getListFloor1() {
        ListFloor1Request listFloor1Request = new ListFloor1Request();
        if (mHospitalResponse != null) {
            listFloor1Request.hospitalId = mHospitalResponse.getHospitalId();
        }
        BaseProvider.request(new HttpRequest(listFloor1Request).build(getActivity()),
                new OnJsonCallBack<List<FloorResponse>>() {
                    @Override
                    public void onResult(List<FloorResponse> data) {
                        Message message = Message.obtain();
                        message.what = REQUEST_LOAD_DOCTOR_LIST;
                        message.obj = data;
                        mHandler.sendMessage(message);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                    }
                });
    }


    private void loadCategoryData() {
        CategoryListRequest listRequest = new CategoryListRequest();
        BaseProvider.request(new HttpRequest(listRequest).build(getActivity()),
                new OnJsonCallBack() {
                    @Override
                    public void onResult(Object data) {
                        mHandler.sendEmptyMessage(REQUEST_LOAD_FLOOR);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_FLOOR);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_FLOOR);
                    }
                });
    }

    /**
     * 加载医院数据
     */
    private void loadHospitalData() {
        HomeHospitalRequest request = new HomeHospitalRequest();
        //request.cityId = LocationHelper.getLocationHelper(getActivity()).getCityCode();
        BaseProvider.request(new HttpRequest(request).build(getActivity()),
                new OnJsonCallBack<List<HospitalResponse>>() {
                    @Override
                    public void onResult(List<HospitalResponse> data) {
                        // List<HospitalResponse>
                        if (AdapterUtil.isListNotEmpty(data)) {
                            mHospitalResponse = data.get(0);
                        }
                        mHandler.sendEmptyMessage(REQUEST_LOAD_CATEGORY);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_CATEGORY);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_CATEGORY);
                    }
                });
    }

    /**
     * 加载banner
     */
    private void loadBannerData() {
        BannerListRequest listRequest = new BannerListRequest();
        BaseProvider.request(new HttpRequest(listRequest).build(getActivity()),
                new OnJsonCallBack<List<String>>() {
                    @Override
                    public void onResult(List<String> data) {
                        itemBanner.setData(data);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_HOSPITAL);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_HOSPITAL);
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        mHandler.sendEmptyMessage(REQUEST_LOAD_HOSPITAL);
                    }
                });
    }


    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViewAndData() {
        mHandler.sendEmptyMessage(REQUEST_LOAD_BANNER);
    }


    class HomePagerAdapter extends FragmentPagerAdapter {

        private List<FloorResponse> mFloorResponseList;


        public HomePagerAdapter(FragmentManager fm, List<FloorResponse> floorList) {
            super(fm);
            mFloorResponseList = floorList;
        }

        @Override
        public Fragment getItem(int position) {
            return new DoctorListFragment(mFloorResponseList.get(position).getId(), mHospitalResponse.getHospitalId());
        }

        @Override
        public int getCount() {
            return mFloorResponseList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mFloorResponseList.get(position).getDeptName();
        }

    }


}
