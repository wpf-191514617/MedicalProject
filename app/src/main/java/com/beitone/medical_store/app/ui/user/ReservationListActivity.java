package com.beitone.medical_store.app.ui.user;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class ReservationListActivity extends BaseRecyclerActivity {

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        setTitle("我的预约");
        return new ReservationListAdapter(recyclerView);
    }


    private void loadList(){
        setData(null);
    }


    @Override
    public void showNormal() {
        View contentView = LayoutInflater.from(this).inflate(R.layout.layout_reservation_empty ,
                null);
        contentView.findViewById(R.id.tvReservation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reStoreView();
                setData(TestUtil.getTestListData());
            }
        });
        mVaryViewHelperController.switchContentView(contentView);
    }



    class ReservationListAdapter extends BaseRecyclerAdapter<String>{

        public ReservationListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_reservation);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            TextView tvReservationTag = helper.getTextView(R.id.tvReservationTag);
            if ((position+1) % 2 == 0){
                tvReservationTag.setText("就诊中");
                tvReservationTag.setBackgroundResource(R.drawable.bg_reservation_2);
            } else {
                if ((position+1) % 3 == 0){
                    tvReservationTag.setText("已结束");
                    tvReservationTag.setBackgroundResource(R.drawable.bg_reservation_3);
                } else {
                    tvReservationTag.setText("待就诊");
                    tvReservationTag.setBackgroundResource(R.drawable.bg_reservation_1);
                }
            }
            helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jumpTo(ReservationDetailActivity.class);
                }
            });
        }
    }

}
