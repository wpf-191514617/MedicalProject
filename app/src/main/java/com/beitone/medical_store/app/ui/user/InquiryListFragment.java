package com.beitone.medical_store.app.ui.user;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class InquiryListFragment extends BaseRecyclerFragment {
    @Override
    protected void onRefresh() {
        setData(TestUtil.getTestListData(10));
    }

    @Override
    protected void onLoadMore() {
        setData(TestUtil.getTestListData(10));
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new InquiryListAdapter(recyclerView);
    }


    class InquiryListAdapter extends BaseRecyclerAdapter<String>{

        public InquiryListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_inquiry);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jumpTo(InquiryDetailActivity.class);
                }
            });
        }
    }

}
