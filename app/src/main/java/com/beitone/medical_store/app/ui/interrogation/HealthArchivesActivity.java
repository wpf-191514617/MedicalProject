package com.beitone.medical_store.app.ui.interrogation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.view.SingleSelectDialog;
import com.beitone.medical_store.app.widget.AppButton;
import com.beitone.medical_store.app.widget.AppCheckBox;
import com.beitone.medical_store.app.widget.InputLayout;
import com.bigkoo.pickerview.builder.TimePickerBuilder;
import com.bigkoo.pickerview.listener.OnTimeSelectListener;
import com.bigkoo.pickerview.view.TimePickerView;

import java.util.Arrays;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.util.DateUtils;

public class HealthArchivesActivity extends BaseActivity {

    @BindView(R.id.inputRelation)
    InputLayout inputRelation;
    @BindView(R.id.inputName)
    InputLayout inputName;
    @BindView(R.id.cbMan)
    AppCheckBox cbMan;
    @BindView(R.id.cbWomen)
    AppCheckBox cbWomen;
    @BindView(R.id.inputIDCard)
    InputLayout inputIDCard;
    @BindView(R.id.inputBirthDay)
    InputLayout inputBirthDay;
    @BindView(R.id.btnSubmit)
    AppButton btnSubmit;

    private SingleSelectDialog mSingleSelectDialog;

    private TimePickerView mTimePickerView;

    private boolean isEdit = false;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_health_archives;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        if (isEdit) {
            setTitle("编辑健康档案");
            btnSubmit.setText("保存并提交");
        } else {
            setTitle("新增健康档案");
            btnSubmit.setText("创建档案并提交");
        }

        mTimePickerView = new TimePickerBuilder(this, new OnTimeSelectListener() {
            @Override
            public void onTimeSelect(Date date, View v) {
                try {
                    inputBirthDay.inputContent(DateUtils.formatDate(date));
                } catch (Exception e) {

                }
            }
        }).setSubmitText("确定").setCancelText("取消")
                .setTitleBgColor(Color.parseColor("#ebebeb"))
                .setTitleColor(Color.parseColor("#2177d5")).setTitleText(" ")
                .setSubmitColor(Color.parseColor("#0099de")).setCancelColor(Color.parseColor("#0099de"))
                .setDividerColor(Color.parseColor("#2cb7f6")).setOutSideCancelable(true)//点击外部dismiss default true
                .setLabel("年", "月", "日", "", "", "") //设置空字符串以隐藏单位提示   hide label
                .setDividerColor(Color.parseColor("#e7e7e7")).build();

        inputBirthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTimePickerView.show();
            }
        });
        inputRelation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mSingleSelectDialog == null){
                    mSingleSelectDialog = new SingleSelectDialog(HealthArchivesActivity.this ,
                            Arrays.asList(getResources().getStringArray(R.array.relations)),onSingleSelectListener);
                }
                mSingleSelectDialog.show();
            }
        });
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        isEdit = extras.getBoolean("isEdit");
    }

    @OnClick({R.id.cbMan,  R.id.btnSubmit, R.id.cbWomen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cbMan:
                cbMan.setChecked(true);
                cbWomen.setChecked(false);
                break;
            case R.id.cbWomen:
                cbMan.setChecked(false);
                cbWomen.setChecked(true);
                break;
            case R.id.btnSubmit:
                break;
        }
    }

    private SingleSelectDialog.OnSingleSelectListener onSingleSelectListener = new SingleSelectDialog.OnSingleSelectListener() {
        @Override
        public void onSingleSelect(int position, String data) {
            inputRelation.inputContent(data);
        }
    };

}
