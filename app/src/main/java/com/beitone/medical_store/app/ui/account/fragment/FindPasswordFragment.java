package com.beitone.medical_store.app.ui.account.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
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
                break;
            case R.id.countDownButton:
                countDownButton.start();
                break;
            case R.id.btnNext:
                if (mCallback !=null){
                    mCallback.onFindNext(etPhone.getText().toString());
                }
                break;
        }
    }


    public interface Callback {
        void onFindNext(String findPhone);
    }

}
