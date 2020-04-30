package com.beitone.medical_store.app.ui.home.item;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.DoctorListActivity;
import com.beitone.medical_store.app.ui.interrogation.SubmitQuestionActivity;
import com.beitone.medical_store.app.ui.medicine.MedicineHomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuickEntryItem extends LinearLayout {

    @BindView(R.id.layoutQuickInterrogation)
    LinearLayout layoutQuickInterrogation;
    @BindView(R.id.layoutDeliverMedicine)
    LinearLayout layoutDeliverMedicine;
    @BindView(R.id.layoutFindDoctor)
    LinearLayout layoutFindDoctor;

    public QuickEntryItem(Context context) {
        this(context, null);
    }

    public QuickEntryItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public QuickEntryItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.item_home_quickentry, this);
        ButterKnife.bind(contentView);
    }


    @OnClick({R.id.layoutQuickInterrogation, R.id.layoutDeliverMedicine, R.id.layoutFindDoctor})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutQuickInterrogation:
                getContext().startActivity(new Intent(getContext() , SubmitQuestionActivity.class));
                break;
            case R.id.layoutDeliverMedicine:
                getContext().startActivity(new Intent(getContext() , MedicineHomeActivity.class));
                break;
            case R.id.layoutFindDoctor:
                Bundle bundle = new Bundle();
                bundle.putBoolean("isFindDoc" , true);
                Intent intent = new Intent(getContext() , DoctorListActivity.class);
                intent.putExtras(bundle);
                getContext().startActivity(intent);
                break;
        }
    }
}
