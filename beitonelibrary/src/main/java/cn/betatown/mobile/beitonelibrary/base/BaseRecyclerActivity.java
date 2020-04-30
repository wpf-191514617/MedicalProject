package cn.betatown.mobile.beitonelibrary.base;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.Unbinder;
import cn.betatown.mobile.beitonelibrary.R;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;

public abstract class BaseRecyclerActivity extends BaseActivity implements OnRefreshListener,
        OnLoadMoreListener {

    protected RecyclerView recyclerView;
    protected SmartRefreshLayout refreshLayout;

    protected BaseRecyclerAdapter mAdapter;

    protected int mCurrentPage = 1;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_list;
    }

    @Override
    protected void initViewAndData() {
        recyclerView = findViewById(R.id.recyclerView);
        refreshLayout = findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadMoreListener(this);

        initLayoutManager();

        mAdapter = getAdapter();
        recyclerView.setAdapter(mAdapter);
        refreshLayout.autoRefresh(300);
    }


    protected void initLayoutManager() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    protected void finishLoad() {
        if (refreshLayout != null) {
            refreshLayout.finishRefresh();
            refreshLayout.finishLoadMore();
        }
    }

    protected void setData(List<?> data) {
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
    protected View getLoadingTargetView() {
        return findViewById(R.id.refreshLayout);
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

    protected abstract void onRefresh();

    protected abstract void onLoadMore();

    protected abstract BaseRecyclerAdapter getAdapter();

    @Override
    protected void onClickReload() {
        super.onClickReload();
        refreshLayout.autoRefresh();
    }
}
