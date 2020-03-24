package com.beitone.medical_store.app.ui.account.fragment;

import com.beitone.medical_store.app.R;

import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class FindPasswordFragment extends BaseFragment {

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

    }


    public interface Callback{
        void onFindNext();
    }

}
