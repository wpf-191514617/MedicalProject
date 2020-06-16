package com.beitone.medical.doctor.ui.prescription.fragment;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.prescription.ChineseMedicineActivity;
import com.beitone.medical.doctor.ui.prescription.WesternMedicineActivity;
import com.beitone.medical.doctor.widget.AppSpinner;

import java.util.Arrays;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class ChineseMedicineFragment extends BaseRecyclerFragment {

    @Override
    protected void onRefresh() {
        loadData();
    }

    @Override
    protected void onLoadMore() {

    }

    private void loadData(){
        refreshLayout.setEnableLoadMore(false);
        setData(DataUtil.getData(10));
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new ChineseMedicineListAdapter(recyclerView);
    }


    class ChineseMedicineListAdapter extends BaseRecyclerAdapter{

        private String[] array = {"Item1","Item2","Item3","Item4"};

        public ChineseMedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            switch (position) {
                case 0:
                    return R.layout.item_prescription_head;
                case 1:
                    return R.layout.item_chinese_medicine_select;
                case 2:
                    return R.layout.item_chinese_waist;
                case 9:
                    return R.layout.item_add_medicine;
                default:
                    return R.layout.item_chinese_medicine1;
            }
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, Object model) {

            switch (position){
                case 1:
                    AppSpinner spinnerFrequency = helper.getView(R.id.spinnerFrequency);
                    spinnerFrequency.setDatas(Arrays.asList(array));
                    spinnerFrequency.setOnItemSelectListener(new AppSpinner.OnItemSelectListener() {
                        @Override
                        public void onItemSelect(int position, String data) {
                            spinnerFrequency.inputText(data);
                        }
                    });

                    AppSpinner spinnerUsage = helper.getView(R.id.spinnerUsage);
                    spinnerUsage.setDatas(Arrays.asList(array));
                    spinnerUsage.setOnItemSelectListener(new AppSpinner.OnItemSelectListener() {
                        @Override
                        public void onItemSelect(int position, String data) {
                            spinnerUsage.inputText(data);
                        }
                    });
                    break;
                case 9:
                    helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(ChineseMedicineActivity.class);
                        }
                    });
                    break;
            }
        }

    }

}
