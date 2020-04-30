package com.beitone.medical_store.app.ui.hospital.payment;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class CostDetailActivity extends BaseActivity {

    @BindView(R.id.rvCost)
    RecyclerView rvCost;
    @BindView(R.id.btnPay)
    AppButton btnPay;

    private CostListAdapter mCostListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_cost_detail;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("费用清单");
        rvCost.setLayoutManager(new LinearLayoutManager(this));
        mCostListAdapter = new CostListAdapter(rvCost);
        rvCost.setAdapter(mCostListAdapter);
        mCostListAdapter.setData(TestUtil.getTestListData(8));
    }


    @OnClick(R.id.btnPay)
    public void onViewClicked() {
    }


    class CostListAdapter extends BaseRecyclerAdapter<String>{

        public CostListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_cost);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
