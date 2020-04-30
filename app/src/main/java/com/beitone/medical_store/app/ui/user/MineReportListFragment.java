package com.beitone.medical_store.app.ui.user;

import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class MineReportListFragment extends BaseRecyclerFragment {
    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
    }


    private void loadList() {
        setData(TestUtil.getTestListData(10));
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
            } else {
                if ((position + 1) % 3 == 0) {
                    layoutReportHead.setBackgroundResource(R.drawable.bg_report_head2);
                } else {
                    layoutReportHead.setBackgroundResource(R.drawable.bg_report_head3);
                }
            }


        }
    }

}
