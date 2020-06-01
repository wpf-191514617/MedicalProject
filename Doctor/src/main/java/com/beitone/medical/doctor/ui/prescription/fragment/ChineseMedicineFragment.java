package com.beitone.medical.doctor.ui.prescription.fragment;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class ChineseMedicineFragment extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {

    }

    @Override
    protected void onLoadMore() {

    }

    private void loadData(){
        refreshLayout.setEnableLoadMore(false);
        setData(DataUtil.getData(8));
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return null;
    }


    class ChineseMedicineListAdapter extends BaseRecyclerAdapter{

        public ChineseMedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {

            return super.getItemViewType(position);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, Object model) {

        }

    }

}
