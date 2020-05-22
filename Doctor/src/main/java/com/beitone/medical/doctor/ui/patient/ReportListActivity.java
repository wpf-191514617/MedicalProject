package com.beitone.medical.doctor.ui.patient;

import android.view.View;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class ReportListActivity extends BaseRecyclerActivity {
    @Override
    protected void onRefresh() {
        refreshLayout.setEnableLoadMore(false);
        setData(DataUtil.getData());
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        setTitle("查看报告");
    }

    @Override
    protected void onLoadMore() {

    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new ReportListAdapter(recyclerView);
    }


    class ReportListAdapter extends BaseRecyclerAdapter<String> {

        public ReportListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_minereport);

        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            LinearLayout layoutReportHead = helper.getView(R.id.layoutReportHead);
            if ((position + 1) % 2 == 0) {
                layoutReportHead.setBackgroundResource(R.drawable.bg_report_head1);
                helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jumpTo(ReportInfoActivity.class);
                    }
                });
            } else {
                if ((position + 1) % 3 == 0) {
                    layoutReportHead.setBackgroundResource(R.drawable.bg_report_head2);
                } else {
                    layoutReportHead.setBackgroundResource(R.drawable.bg_report_head3);
                    helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(ReportDetailActivity.class);
                        }
                    });
                }
            }

        }
    }

}
