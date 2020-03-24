package com.beitone.medical_store.app.ui.account.fragment;

import com.beitone.medical_store.app.R;

import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class BindPhoneFragment extends BaseFragment {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_bindphone;
    }

    @Override
    protected void initViewAndData() {

    }


    public interface Callback{
        void loginBindSuccess();
    }

}
