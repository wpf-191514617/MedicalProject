package com.beitone.medical_store.app.ui.hospital.medical_records;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

/**
 * 就诊记录
 */

public class MedicalRecordsActivity extends BaseActivity {

    @BindView(R.id.rvMedicalRecords)
    RecyclerView rvMedicalRecords;

    private RecordsListAdapter mRecordsListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_records;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("就诊记录");
        rvMedicalRecords.setLayoutManager(new LinearLayoutManager(this));
        mRecordsListAdapter = new RecordsListAdapter(rvMedicalRecords);
        rvMedicalRecords.setAdapter(mRecordsListAdapter);
        mRecordsListAdapter.setData(TestUtil.getTestListData(10));
        mRecordsListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(MedicalDetailActivity.class);
            }
        });
    }

    class RecordsListAdapter extends BaseRecyclerAdapter<String>{

        public RecordsListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_medical_record);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
