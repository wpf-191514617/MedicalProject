package com.beitone.medical.doctor.ui.evaluation;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class EvaluationListFragment extends BaseRecyclerFragment {
    @Override
    protected void onRefresh() {
        setData(DataUtil.getData(10));
    }

    @Override
    protected void onLoadMore() {
        setData(DataUtil.getData(5));
    }

    public void refreshData(){
        refreshLayout.autoRefresh(200);
    }


    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshData();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new EvaluationListAdapter(recyclerView);
    }

    class EvaluationListAdapter extends BaseRecyclerAdapter<String>{

        public EvaluationListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_doctor_evaluation);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
