package com.beitone.medical_store.app.ui.hospital.medical_card;

import android.os.Bundle;
import android.view.View;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.interrogation.HealthArchivesActivity;
import com.beitone.medical_store.app.view.SingleSelectDialog;
import com.beitone.medical_store.app.widget.InputLayout;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class CreateCardActivity extends BaseActivity implements SingleSelectDialog.OnSingleSelectListener {
    @BindView(R.id.inputName)
    InputLayout inputName;
    @BindView(R.id.inputPhone)
    InputLayout inputPhone;
    @BindView(R.id.inputIDCard)
    InputLayout inputIDCard;
    @BindView(R.id.inputMembership)
    InputLayout inputMembership;
    @BindView(R.id.inputDetailAddress)
    InputLayout inputDetailAddress;

    private SingleSelectDialog mSingleSelectDialog;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_create_card;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("在线建卡");
        inputMembership.inputContent("本人");
        inputMembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mSingleSelectDialog == null){
                    mSingleSelectDialog = new SingleSelectDialog(CreateCardActivity.this ,
                            Arrays.asList(getResources().getStringArray(R.array.relations)),
                            CreateCardActivity.this);
                }
                mSingleSelectDialog.show();
            }
        });
    }


    @OnClick(R.id.btnDeFine)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onSingleSelect(int position, String data) {
        inputMembership.inputContent(data);
    }
}
