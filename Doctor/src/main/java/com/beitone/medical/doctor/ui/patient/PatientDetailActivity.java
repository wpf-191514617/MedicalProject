package com.beitone.medical.doctor.ui.patient;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class PatientDetailActivity extends BaseRecyclerActivity {

    @Override
    protected void onRefresh() {
        refreshLayout.setEnableLoadMore(false);
        setData(DataUtil.getData());
    }

    @Override
    protected void onLoadMore() {

    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        setTitle("就诊记录");
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new PatientDetailAdapter(recyclerView);
    }

    class PatientDetailAdapter extends BaseRecyclerAdapter<String>{

        public PatientDetailAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }


        @Override
        public int getItemViewType(int position) {
            if (position == 0){
                return R.layout.item_patient_head;
            }
            return R.layout.item_patient_detail;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            if (position != 0){
                helper.getView(R.id.tvCheckReport).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jumpTo(ReportListActivity.class);
                    }
                });
            }
        }
    }


}
