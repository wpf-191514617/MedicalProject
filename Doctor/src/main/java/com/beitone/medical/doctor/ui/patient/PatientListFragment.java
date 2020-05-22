package com.beitone.medical.doctor.ui.patient;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class PatientListFragment  extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {
        loadPatientList();
    }

    @Override
    protected void onLoadMore() {
        loadPatientList();
    }

    private void loadPatientList() {
        setData(DataUtil.getData());
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
        mAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(PatientDetailActivity.class);
            }
        });
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new PatientListAdapter(recyclerView);
    }

    class PatientListAdapter extends BaseRecyclerAdapter<String>{

        public PatientListAdapter(RecyclerView recyclerView){
            super(recyclerView, R.layout.item_patient);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
