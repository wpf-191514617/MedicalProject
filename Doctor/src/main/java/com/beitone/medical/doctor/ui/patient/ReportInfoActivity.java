package com.beitone.medical.doctor.ui.patient;

import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class ReportInfoActivity extends BaseActivity {


    @BindView(R.id.lineTitle)
    View lineTitle;
    @BindView(R.id.rvCost)
    RecyclerView rvCost;

    private ReportInfoAdapter mReportInfoAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reportinfo;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("报告单");
        lineTitle.setVisibility(View.VISIBLE);
        rvCost.setLayoutManager(new LinearLayoutManager(this));
        mReportInfoAdapter = new ReportInfoAdapter(rvCost);
        rvCost.setAdapter(mReportInfoAdapter);
        mReportInfoAdapter.setData(DataUtil.getData());
    }



    class ReportInfoAdapter extends BaseRecyclerAdapter{

        public ReportInfoAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_check_item);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, Object model) {

        }
    }

}
