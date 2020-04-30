package com.beitone.medical_store.app.ui.hospital;

import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.medical_card.BindCardActivity;
import com.beitone.medical_store.app.ui.hospital.medical_card.MedicalCardDetailActivity;
import com.beitone.medical_store.app.ui.hospital.medical_records.MedicalDetailActivity;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class HospitalServiceActivity extends BaseActivity {

    @BindView(R.id.rvHospital)
    RecyclerView rvHospital;

    private HospitalListAdapter mHospitalListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_hospitalhome;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("院内服务");
        rvHospital.setLayoutManager(new LinearLayoutManager(this));
        mHospitalListAdapter = new HospitalListAdapter(rvHospital);
        rvHospital.setAdapter(mHospitalListAdapter);
        mHospitalListAdapter.setData(TestUtil.getTestListData(10));
    }


    class HospitalListAdapter extends BaseRecyclerAdapter<String>{

        HospitalListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            switch (position){
                case 0:
                    return R.layout.item_hospital_outpatient;
                case 1:
                    return R.layout.item_hospital_being;
                case 2:
                    return R.layout.item_hospital_other;
                case 3:
                    return R.layout.item_hoapital_add;
                default:
                    return R.layout.item_vsiting_person;
            }
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            switch (position){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    helper.getView(R.id.tvAddVisitingPerson).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(BindCardActivity.class);
                        }
                    });
                    break;
                default:
                    helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(MedicalCardDetailActivity.class);
                        }
                    });
                    break;
            }
        }
    }


}
