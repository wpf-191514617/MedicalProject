package com.beitone.medical.doctor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;

public class ChineseMedicineItem extends LinearLayout {

    private RecyclerView rvChineseMedicine;

    private ChineseMedicineListAdapter medicineListAdapter;

    public ChineseMedicineItem(Context context) {
        this(context , null);
    }

    public ChineseMedicineItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public ChineseMedicineItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView =
                LayoutInflater.from(context).inflate(R.layout.layout_chinese_medicine_item, this);
        rvChineseMedicine = contentView.findViewById(R.id.rvChineseMedicine);
        rvChineseMedicine.setLayoutManager(new LinearLayoutManager(context));
        medicineListAdapter = new ChineseMedicineListAdapter(rvChineseMedicine);
        rvChineseMedicine.setAdapter(medicineListAdapter);
        medicineListAdapter.setData(DataUtil.getData(5));
    }


    class ChineseMedicineListAdapter extends BaseRecyclerAdapter{

        public ChineseMedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            if (position == getItemCount()-1){
                return R.layout.item_chinese_medicine_foot;
            }
            return R.layout.item_chinese_medicine;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, Object model) {

        }

    }


}
