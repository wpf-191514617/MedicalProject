package com.beitone.medical.doctor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;

public class WesternMedicineItem extends LinearLayout {

    private RecyclerView rvWesternMedicine;

    private WesternMedicineListAdapter westernMedicineListAdapter;

    public WesternMedicineItem(Context context) {
        this(context , null);
    }

    public WesternMedicineItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public WesternMedicineItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView =
                LayoutInflater.from(context).inflate(R.layout.layout_western_medicine_item, this);
        rvWesternMedicine = contentView.findViewById(R.id.rvWesternMedicine);
        rvWesternMedicine.setLayoutManager(new LinearLayoutManager(context));
        westernMedicineListAdapter = new WesternMedicineListAdapter(rvWesternMedicine);
        rvWesternMedicine.setAdapter(westernMedicineListAdapter);
        westernMedicineListAdapter.setData(DataUtil.getData(5));
    }


    class WesternMedicineListAdapter extends BaseRecyclerAdapter {
        public WesternMedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_western_medicine);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, Object model) {

        }

    }

}
