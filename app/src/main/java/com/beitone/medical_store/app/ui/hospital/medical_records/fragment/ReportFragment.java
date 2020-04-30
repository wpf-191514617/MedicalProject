package com.beitone.medical_store.app.ui.hospital.medical_records.fragment;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class ReportFragment extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new ReportListAdapter(recyclerView);
    }

    private void loadList(){
        setData(TestUtil.getTestListData(10));
    }



    class ReportListAdapter extends BaseRecyclerAdapter<String>{

        public ReportListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_record);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
