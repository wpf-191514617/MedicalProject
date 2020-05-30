package com.beitone.medical.doctor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.R;

import java.util.ArrayList;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;

public class RevenueListView extends LinearLayout {

    private RevenueListAdapter mRevenueListAdapter;

    public RevenueListView(Context context) {
        this(context,null);
    }

    public RevenueListView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RevenueListView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
       View contentView =
               LayoutInflater.from(context).inflate(R.layout.layout_revenue_list_view ,this);
        contentView.findViewById(R.id.tvCheckMoreRevenue).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        RecyclerView rvRevenueList = contentView.findViewById(R.id.rvRevenueList);
        rvRevenueList.setLayoutManager(new LinearLayoutManager(context));
        mRevenueListAdapter = new RevenueListAdapter(rvRevenueList);
        rvRevenueList.setAdapter(mRevenueListAdapter);
        List<String> data = new ArrayList<>();
        data.add("");
        data.add("");
        data.add("");
        data.add("");
        data.add("");
        mRevenueListAdapter.setData(data);
    }


    class RevenueListAdapter extends BaseRecyclerAdapter<String>{

        public RevenueListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_revenue_list);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            int count = position % 5;
            switch (count){
                case 0:
                    helper.setImageResource(R.id.ivInquiryType , R.drawable.ic_inquiry_text);
                    break;
                case 1:
                    helper.setImageResource(R.id.ivInquiryType , R.drawable.ic_inquiry_video);
                    break;
                case 2:
                    helper.setImageResource(R.id.ivInquiryType , R.drawable.ic_inquiry_phone);
                    break;
                case 3:
                    helper.setImageResource(R.id.ivInquiryType , R.drawable.ic_inquiry_prescription);
                    break;
                case 4:
                    helper.setImageResource(R.id.ivInquiryType , R.drawable.ic_inquiry_prescription);
                    break;
            }
        }


    }

}
