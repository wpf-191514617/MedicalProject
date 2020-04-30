package com.beitone.medical_store.app.ui.user;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class MineDoctorActivity extends BaseRecyclerActivity {
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
        setTitle("我的医生");
        return new MineDocListAdapter(recyclerView);
    }

    private void loadList(){
        setData(TestUtil.getTestListData());
    }


    class MineDocListAdapter extends BaseRecyclerAdapter<String>{

        MineDocListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_mine_doctor);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
