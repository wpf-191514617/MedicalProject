package com.beitone.medical_store.app.ui.medicine;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.user.MineMedicineListActivity;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class MedicineHomeActivity extends BaseActivity {

    @BindView(R.id.tvAllMedicine)
    TextView tvAllMedicine;
    @BindView(R.id.rvMineMedicine)
    RecyclerView rvMineMedicine;
    @BindView(R.id.layoutPrescription)
    LinearLayout layoutPrescription;
    @BindView(R.id.rvPharmacy)
    RecyclerView rvPharmacy;

    private MedicineListAdapter medicineListAdapter;
    private PharmacyListAdapter pharmacyListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medicine;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("送药上门");
        rvMineMedicine.setLayoutManager(new LinearLayoutManager(this ,
                LinearLayoutManager.HORIZONTAL , false));
        medicineListAdapter = new MedicineListAdapter(rvMineMedicine);
        rvMineMedicine.setAdapter(medicineListAdapter);
        medicineListAdapter.setData(TestUtil.getSortDatas());

        rvPharmacy.setLayoutManager(new LinearLayoutManager(this));
        pharmacyListAdapter = new PharmacyListAdapter(rvPharmacy);
        rvPharmacy.setAdapter(pharmacyListAdapter);
        pharmacyListAdapter.setData(TestUtil.getTestListData());
    }

    @OnClick({R.id.tvAllMedicine, R.id.layoutPrescription})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvAllMedicine:
                jumpTo(MineMedicineListActivity.class);
                break;
            case R.id.layoutPrescription:
                break;
        }
    }



    class MedicineListAdapter extends BaseRecyclerAdapter<String>{

        public MedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_medicine);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }


    class PharmacyListAdapter extends BaseRecyclerAdapter<String>{

        public PharmacyListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_pharmacy);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }


}
