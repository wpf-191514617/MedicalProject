package com.beitone.medical_store.app.ui.user;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class MineMedicineListActivity extends BaseRecyclerActivity {

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
    protected void initViewAndData() {
        super.initViewAndData();
        setTitle("我的用药");
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new MedicineListAdapter(recyclerView);
    }


    class MedicineListAdapter extends BaseRecyclerAdapter<String>{

        public MedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_medicine_1);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
