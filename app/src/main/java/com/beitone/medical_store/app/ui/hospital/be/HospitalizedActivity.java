package com.beitone.medical_store.app.ui.hospital.be;

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

public class HospitalizedActivity extends BaseActivity {

    @BindView(R.id.rvHospitalized)
    RecyclerView rvHospitalized;

    private HospitalizedListAdapter mHospitalizedListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_hospitalized;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("住院结算");
        rvHospitalized.setLayoutManager(new LinearLayoutManager(this));
        mHospitalizedListAdapter = new HospitalizedListAdapter(rvHospitalized);
        rvHospitalized.setAdapter(mHospitalizedListAdapter);
        mHospitalizedListAdapter.setData(TestUtil.getTestListData(5));
    }


    class HospitalizedListAdapter extends BaseRecyclerAdapter<String>{

        public HospitalizedListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_hospitalized);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
