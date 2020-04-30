package com.beitone.medical_store.app.ui.doctor.fragment;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.DoctorHomeActivity;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class FindDocListFragment extends BaseRecyclerFragment {

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
    }

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    private void loadList() {
        setData(TestUtil.getTestListData());
    }

    @Override
    protected void initLayoutManager() {
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(new ColorDrawable(ContextCompat.getColor(getActivity(),
                R.color.grayDE)));
        recyclerView.addItemDecoration(itemDecoration);
        super.initLayoutManager();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        mAdapter = new DoctorListAdapter(recyclerView);
        mAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(DoctorHomeActivity.class);
            }
        });
        return mAdapter;
    }


    class DoctorListAdapter extends BaseRecyclerAdapter<String>{

        public DoctorListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_home_doctor);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }



}
