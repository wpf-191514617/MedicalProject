package com.beitone.medical_store.app.ui.account;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class LoginAuthActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.fragment_loginauth;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
    }

}
