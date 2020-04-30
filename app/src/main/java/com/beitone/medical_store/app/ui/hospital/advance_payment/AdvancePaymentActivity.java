package com.beitone.medical_store.app.ui.hospital.advance_payment;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class AdvancePaymentActivity extends BaseActivity {

    @BindView(R.id.rvPayment)
    RecyclerView rvPayment;
    private AdvancePaymentListAdapter mAdvancePaymentListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_advance_payment;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("预交金缴纳");
        rvPayment.setLayoutManager(new LinearLayoutManager(this));
        mAdvancePaymentListAdapter = new AdvancePaymentListAdapter(rvPayment);
        rvPayment.setAdapter(mAdvancePaymentListAdapter);
        mAdvancePaymentListAdapter.setData(TestUtil.getTestListData(2));
    }


    class AdvancePaymentListAdapter extends BaseRecyclerAdapter<String> {

        public AdvancePaymentListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_advance_payment);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }


}
