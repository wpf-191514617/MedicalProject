package com.beitone.medical_store.app.ui.hospital.report;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class ReportHomeActivity extends BaseActivity {
    @BindView(R.id.rvReport)
    RecyclerView rvReport;

    private ReportListAdapter mReportListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reporthome;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("体检报告");
        rvReport.setLayoutManager(new LinearLayoutManager(this));
        mReportListAdapter = new ReportListAdapter(rvReport);
        rvReport.setAdapter(mReportListAdapter);
        mReportListAdapter.setData(TestUtil.getTestListData(10));
    }



    class ReportListAdapter extends BaseRecyclerAdapter<String>{

        public ReportListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_report);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }


}
