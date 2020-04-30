package com.beitone.medical_store.app.ui.hospital.reservation;

import android.text.TextUtils;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class DiseaseListFragment extends BaseRecyclerFragment {
    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new DiseaseListAdapter(recyclerView);
    }

    private void loadList(){
        setData(TestUtil.getTestListData());
    }


    class DiseaseListAdapter extends BaseRecyclerAdapter<String>{

        public DiseaseListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_text);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
