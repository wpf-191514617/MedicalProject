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
    @BindView(R.id.common_toolbar)
    Toolbar commonToolbar;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etAuthCode)
    EditText etAuthCode;
    @BindView(R.id.btnLogin)
    AppButton btnLogin;
    @BindView(R.id.tvLoginType1)
    TextView tvLoginType1;
    @BindView(R.id.ivWechatLogin)
    ImageView ivWechatLogin;
    @BindView(R.id.ivQQLogin)
    ImageView ivQQLogin;
   /* @BindView(R.id.cbProtocol)
    AppCheckBox cbProtocol;
    @BindView(R.id.tvProtocol)
    TextView tvProtocol;*/

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.fragment_loginauth;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnLogin, R.id.tvLoginType1, R.id.ivWechatLogin, R.id.ivQQLogin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                break;
            case R.id.tvLoginType1:
                break;
            case R.id.ivWechatLogin:
                break;
            case R.id.ivQQLogin:
                break;
        }
    }
}
