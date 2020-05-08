package com.beitone.medical_store.app.ui.home;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.DoctorHomeActivity;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class DoctorListFragment extends BaseFragment {

    RecyclerView mRvList;

    @Override
    protected int getContentViewLayoutID() {
        return cn.betatown.mobile.beitonelibrary.R.layout.list;
    }

    @Override
    protected void initViewAndData() {
        mRvList = getView().findViewById(R.id.recyclerView);
        mRvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        DoctorListAdapter listAdapter = new DoctorListAdapter(mRvList);
        mRvList.setAdapter(listAdapter);
        listAdapter.setData(TestUtil.getTestListData());
        listAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(DoctorHomeActivity.class);
            }
        });
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