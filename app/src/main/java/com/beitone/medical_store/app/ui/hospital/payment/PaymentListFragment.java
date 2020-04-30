package com.beitone.medical_store.app.ui.hospital.payment;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class PaymentListFragment extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    private void loadList() {
        setData(TestUtil.getTestListData(10));
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        PaymentListAdapter listAdapter = new PaymentListAdapter(recyclerView);
        listAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(CostDetailActivity.class);
            }
        });
        return listAdapter;
    }


    class PaymentListAdapter extends BaseRecyclerAdapter<String>{

        public PaymentListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_payment_list);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }


}
