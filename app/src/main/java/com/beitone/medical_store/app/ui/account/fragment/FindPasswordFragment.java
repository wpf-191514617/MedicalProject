package com.beitone.medical_store.app.ui.account.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.httpentity.GetPhoneCodeRequest;
import com.beitone.medical_store.app.provider.AccountProvider;
import com.beitone.medical_store.app.view.AppDialog;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.StringUtil;
import cn.betatown.mobile.beitonelibrary.widget.CountDownButton;

public class FindPasswordFragment extends BaseFragment {

    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.ivClearPhone)
    ImageView ivClearPhone;
    @BindView(R.id.etAuthCode)
    EditText etAuthCode;
    @BindView(R.id.countDownButton)
    CountDownButton countDownButton;
    @BindView(R.id.btnNext)
    AppButton btnNext;
    private Callback mCallback;

    public FindPasswordFragment(Callback mCallback) {
        this.mCallback = mCallback;
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_findpassword;
    }

    @Override
    protected void initViewAndData() {
        etPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (StringUtil.isEmpty(charSequence.toString())){
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

    @OnClick({R.id.ivClearPhone, R.id.countDownButton, R.id.btnNext})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivClearPhone:
                etPhone.getText().clear();
                break;
            case R.id.countDownButton:
                String authPhone = etPhone.getText().toString();
                if (StringUtil.isMobileNO2(authPhone)) {
                    sendAuthCode(authPhone);
                } else {
                    showToast("请输入正确的手机号码");
                }
                break;
            case R.id.btnNext:
                String phone = etPhone.getText().toString();
                String code = etAuthCode.getText().toString();
                if (!StringUtil.isMobileNO2(phone)){
                    showToast("请输入正确的手机号码");
                    return;
                }
                if (StringUtil.isEmpty(code)){
                    showToast("请输入验证码");
                    return;
                }
                if (mCallback !=null){
                    mCallback.onFindNext(phone , code);
                }
                break;
        }
    }


    private void sendAuthCode(String phone) {
        GetPhoneCodeRequest codeRequest = new GetPhoneCodeRequest();
        codeRequest.phone = phone;
        BaseProvider.request(new HttpRequest(codeRequest).build(getActivity()), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                countDownButton.start();
                new AppDialog.Builder(getActivity()).setTitle("验证码获取成功，请及时查收")
                        .setOnlyConfrim(true)
                        .setPositive("确定", null).build().show();
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }
        });

    }



    public interface Callback {
        void onFindNext(String findPhone, String authCode);
    }

}
