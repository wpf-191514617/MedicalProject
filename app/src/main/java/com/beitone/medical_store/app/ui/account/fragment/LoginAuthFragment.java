package com.beitone.medical_store.app.ui.account.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;
import cn.betatown.mobile.beitonelibrary.widget.CountDownButton;

public class LoginAuthFragment extends BaseFragment {

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
    @BindView(R.id.ivClearPhone)
    ImageView ivClearPhone;
    @BindView(R.id.countDownButton)
    CountDownButton countDownButton;

    private Callback mCallback;

    public LoginAuthFragment(Callback mCallback) {
        this.mCallback = mCallback;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_loginauth;
    }

    @Override
    protected void initViewAndData() {
        etPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (StringUtil.isEmpty(charSequence.toString())) {
                    ivClearPhone.setVisibility(View.INVISIBLE);
                } else {
                    ivClearPhone.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @OnClick({R.id.btnLogin, R.id.tvLoginType1, R.id.ivWechatLogin, R.id.ivQQLogin,
            R.id.ivClearPhone, R.id.countDownButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.countDownButton:
                countDownButton.start();
                break;
            case R.id.ivClearPhone:
                etPhone.getText().clear();
                break;
            case R.id.btnLogin:
                break;
            case R.id.tvLoginType1:
                if (mCallback != null) {
                    mCallback.loginForPassword();
                }
                break;
            case R.id.ivWechatLogin:
                break;
            case R.id.ivQQLogin:
                break;
        }
    }

    public interface Callback {
        void loginSuccess();

        void loginForPassword();
    }

}
