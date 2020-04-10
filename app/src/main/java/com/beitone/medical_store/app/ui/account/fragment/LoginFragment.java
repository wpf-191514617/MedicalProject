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
import com.beitone.medical_store.app.entity.response.UserResponse;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.provider.AccountProvider;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
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
                String phone = etPhone.getText().toString();
                String password = etPassword.getText().toString();
                if (!StringUtil.isMobileNO(phone)){
                    showToast("请输入正确的手机号");
                    return;
                }
                if (StringUtil.isEmpty(password)){
                    showToast("请输入正确格式的密码");
                    return;
                }
                doLogin(phone , password);
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

    private void doLogin(String phone, String password) {
        AccountProvider.doLoginByPassword(this, phone, password, new OnJsonCallBack<UserResponse>() {
            @Override
            public void onResult(UserResponse data) {
                UserHelper.getInstance().putUserInfo(data);
                if (mCallback != null){
                    mCallback.loginSuccess();
                }
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }
        });
    }


    public interface Callback {
        void loginForAuthCode();

        void loginForgetPassword();

        void loginSuccess();
    }

}
