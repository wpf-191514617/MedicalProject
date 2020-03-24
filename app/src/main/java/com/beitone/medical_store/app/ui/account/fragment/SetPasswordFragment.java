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

public class SetPasswordFragment extends BaseFragment {
    @BindView(R.id.tvSetPhone)
    TextView tvSetPhone;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.ivEyes)
    ImageView ivEyes;
    @BindView(R.id.btnDone)
    AppButton btnDone;

    private boolean isFromFindPassword = false;

    private String phone;

    private Callback mCallback;

    public SetPasswordFragment(Callback mCallback) {
        this.mCallback = mCallback;
    }

    public boolean isFromFindPassword() {
        return isFromFindPassword;
    }

    public void setFromFindPassword(boolean fromFindPassword) {
        isFromFindPassword = fromFindPassword;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_setpassword;
    }

    @Override
    protected void initViewAndData() {
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

    @OnClick({R.id.ivEyes, R.id.btnDone})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivEyes:
                ivEyes.setSelected(!ivEyes.isSelected());
                if (ivEyes.isSelected()){
                    etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                etPassword.setSelection(etPassword.getText().length());
                break;
            case R.id.btnDone:
                if (mCallback != null){
                    mCallback.onSetPasswordDone(isFromFindPassword);
                }
                break;
        }
    }

    public interface Callback{
        void onSetPasswordDone(boolean isFromFindPassword);
    }

}
