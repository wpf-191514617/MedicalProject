package com.beitone.medical_store.app.ui.account.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
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

public class LoginFragment extends BaseFragment {

    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.ivEyes)
    ImageView ivEyes;
    @BindView(R.id.btnLogin)
    AppButton btnLogin;
    @BindView(R.id.tvLoginAuth)
    TextView tvLoginAuth;
    @BindView(R.id.tvForgetPassword)
    TextView tvForgetPassword;
    @BindView(R.id.ivClearPhone)
    ImageView ivClearPhone;

    private Callback mCallback;

    public LoginFragment(Callback callback) {
        this.mCallback = callback;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_login;
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
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (StringUtil.isEmpty(charSequence.toString())) {
                    ivEyes.setVisibility(View.INVISIBLE);
                } else {
                    ivEyes.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    @OnClick({R.id.ivEyes, R.id.btnLogin, R.id.tvLoginAuth, R.id.tvForgetPassword,R.id.ivClearPhone})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivClearPhone:
                etPhone.getText().clear();
                break;
            case R.id.ivEyes:
                ivEyes.setSelected(!ivEyes.isSelected());
                if (ivEyes.isSelected()){
                    etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                etPassword.setSelection(etPassword.getText().length());
                break;
            case R.id.btnLogin:
                break;
            case R.id.tvLoginAuth:
                if (mCallback != null) {
                    mCallback.loginForAuthCode();
                }
                break;
            case R.id.tvForgetPassword:
                if (mCallback != null) {
                    mCallback.loginForgetPassword();
                }
                break;
        }
    }


    public interface Callback {
        void loginForAuthCode();

        void loginForgetPassword();

        void loginSuccess();
    }

}
