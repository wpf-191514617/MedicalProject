package com.beitone.medical_store.app.ui.hospital.reservation.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.reservation.ReservationOrderActivity;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import me.jessyan.autosize.utils.ScreenUtils;

public class ShiftView extends LinearLayout {

    private RecyclerView rvShift;

    private ShiftAdapter mShiftAdapter;

    public ShiftView(Context context) {
        this(context ,null);
    }

    public ShiftView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public ShiftView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_shiftview , this);
        rvShift = contentView.findViewById(R.id.rvShift);
        rvShift.setLayoutManager(new LinearLayoutManager(context ,
                LinearLayoutManager.HORIZONTAL , false));
        mShiftAdapter = new ShiftAdapter(rvShift);
        rvShift.setAdapter(mShiftAdapter);
        mShiftAdapter.setData(TestUtil.getTestListData(8));
    }

    class ShiftAdapter extends BaseRecyclerAdapter<String>{

        public ShiftAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            if (position == 0){
                return R.layout.item_shift_head;
            }
            return R.layout.item_shift;
        }

    @Override
    protected void fillData(BaseViewHolderHelper helper, int position, String model) {
        LinearLayout view = null;
        if (position == 0){
            view = helper.getView(R.id.layoutHead);
        } else {
            view = helper.getView(R.id.layoutShiftContent);
        }
        LinearLayout.LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.width = ScreenUtils.getScreenSize(mContext)[0] / 8;
        view.setLayoutParams(layoutParams);


        switch (position){
            case 0:
                break;
            default:
                helper.getView(R.id.tvAM).setOnClickListener(new OnReservationListener());
                helper.getView(R.id.tvPM).setOnClickListener(new OnReservationListener());
                break;
        }
    }


    class OnReservationListener implements OnClickListener{

        @Override
        public void onClick(View view) {
            getContext().startActivity(new Intent(getContext() , ReservationOrderActivity.class));
        }
    }

}


}
