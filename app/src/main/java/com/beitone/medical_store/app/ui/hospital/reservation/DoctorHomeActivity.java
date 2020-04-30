package com.beitone.medical_store.app.ui.hospital.reservation;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.reservation.item.DoctorInterView;
import com.beitone.medical_store.app.util.TestUtil;
import com.google.android.material.tabs.TabLayout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DoctorHomeActivity extends BaseActivity implements OnRefreshListener,
        OnLoadMoreListener {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;
    @BindView(R.id.btnInterView)
    Button btnInterView;

    private int mCurrentPage = 1;

    private DocHomeListAdapter mAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reservation_doc_home;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生主页");
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadMoreListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new DocHomeListAdapter(recyclerView);
        recyclerView.setAdapter(mAdapter);
        refreshLayout.autoRefresh(500);
    }


    @OnClick(R.id.btnInterView)
    public void onViewClicked() {
    }


    protected void finishLoad() {
        if (refreshLayout != null) {
            refreshLayout.finishRefresh();
            refreshLayout.finishLoadMore();
        }
    }

    protected void setData(List<String> data) {
        finishLoad();
        if (mCurrentPage == 1) {
            if (AdapterUtil.isListNotEmpty(data)) {
                mAdapter.setData(data);
            } else {
                mAdapter.clear();
                showNormal();
            }
        } else {
            if (AdapterUtil.isListNotEmpty(data)) {
                mAdapter.addMoreData(data);
            } else {
                if (refreshLayout != null)
                    refreshLayout.setEnableLoadMore(false);
            }
        }
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        mCurrentPage++;
        onLoadMore();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        mCurrentPage = 1;
        refreshLayout.setEnableLoadMore(true);
        onRefresh();
    }


    protected void onRefresh() {
        loadList();
    }

    protected void onLoadMore() {
        loadList();
    }

    private void loadList() {
        setData(TestUtil.getTestListData(10));
    }


    class DocHomeListAdapter extends BaseRecyclerAdapter<String> {

        public DocHomeListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }


        @Override
        public int getItemViewType(int position) {
            switch (position) {
                case 0:
                    return R.layout.item_doctor_head;
                case 1:
                    return R.layout.item_docinterview;
                case 2:
                    return R.layout.item_lable;
                default:
                    return R.layout.item_doctor_reviews;
            }
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            switch (position) {
                case 1:
                    DoctorInterView docInterView = helper.getView(R.id.docInterView);
                    docInterView.addOnTabSelectedListener(onTabSelectedListener);
                    break;
            }
        }
    }


    private TabLayout.OnTabSelectedListener onTabSelectedListener =
            new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                btnInterView.setVisibility(View.VISIBLE);
            } else {
                btnInterView.setVisibility(View.GONE);
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };


}
