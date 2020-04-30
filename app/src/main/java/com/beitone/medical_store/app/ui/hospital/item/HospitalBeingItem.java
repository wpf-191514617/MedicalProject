package com.beitone.medical_store.app.ui.hospital.item;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.hospital.advance_payment.AdvancePaymentActivity;
import com.beitone.medical_store.app.ui.hospital.be.HospitalizedActivity;
import com.beitone.medical_store.app.ui.hospital.dailylist.DailyListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HospitalBeingItem extends LinearLayout {

    @BindView(R.id.layoutDailyList)
    LinearLayout layoutDailyList;
    @BindView(R.id.layoutPreStore)
    LinearLayout layoutPreStore;
    @BindView(R.id.layoutInpatientSettlement)
    LinearLayout layoutInpatientSettlement;

    public HospitalBeingItem(Context context) {
        this(context, null);
    }

    public HospitalBeingItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HospitalBeingItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_hoapital2, this);
        ButterKnife.bind(contentView);
    }

    @OnClick({R.id.layoutDailyList, R.id.layoutPreStore, R.id.layoutInpatientSettlement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutDailyList:
                getContext().startActivity(new Intent(getContext() , DailyListActivity.class));
                break;
            case R.id.layoutPreStore:
                getContext().startActivity(new Intent(getContext() , AdvancePaymentActivity.class));
                break;
            case R.id.layoutInpatientSettlement:
                getContext().startActivity(new Intent(getContext() , HospitalizedActivity.class));
                break;
        }
    }
}
