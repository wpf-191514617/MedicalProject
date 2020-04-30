package com.beitone.medical_store.app.ui.hospital.medical_card;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.beitone.medical_store.app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class BindCardActivity extends BaseActivity {

    @BindView(R.id.etPersonName)
    EditText etPersonName;
    @BindView(R.id.tvCardLable)
    TextView tvCardLable;
    @BindView(R.id.etNumber)
    EditText etNumber;

    public static final String KEY_BIND_TYPE = "bind.card.type";

    public static final int TYPE_HOSPITALIZED = 1;

    private int TYPE = 0;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_medical_bind_card;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        if (TYPE_HOSPITALIZED == TYPE) {
            setText(tvCardLable, "住院号");
            etNumber.setHint("请输入住院号");
            setTitle("绑定住院号");
        } else {
            setTitle("绑定就诊卡");
        }
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        TYPE = extras.getInt(KEY_BIND_TYPE, 0);
    }

    @OnClick({R.id.btnDeFine, R.id.btnCreateCard})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnDeFine:
                setResult(RESULT_OK);
                finish();
                break;
            case R.id.btnCreateCard:
                jumpToThenKill(CreateCardActivity.class);
                break;
        }
    }
}
