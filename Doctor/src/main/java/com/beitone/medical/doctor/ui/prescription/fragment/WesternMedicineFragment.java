package com.beitone.medical.doctor.ui.prescription.fragment;

import android.graphics.Color;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.prescription.WesternMedicineActivity;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class WesternMedicineFragment extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {
        loadData();
    }

    private void loadData() {
        refreshLayout.setEnableLoadMore(false);
        recyclerView.setBackgroundColor(Color.parseColor("#F5F5F5"));
        setData(DataUtil.getData(5));
    }

    @Override
    protected void onLoadMore() {

    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new WesternListAdapter(recyclerView);
    }


    class WesternListAdapter extends BaseRecyclerAdapter<String> {

        WesternListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            switch (position) {
                case 0:
                    return R.layout.item_prescription_head;
                case 1:
                    return R.layout.item_western_waist;
                case 4:
                    return R.layout.item_add_medicine;
                default:
                    return R.layout.item_western_medicine;
            }
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            if (position != 0 && position != 1 && position != 4) {
                helper.getView(R.id.layoutEditMedicine).setVisibility(View.VISIBLE);
                helper.getView(R.id.tvUpdateMedicine).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jumpTo(WesternMedicineActivity.class);
                    }
                });
            }
        }

    }

}
