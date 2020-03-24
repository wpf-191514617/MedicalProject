package com.beitone.medical_store.app.ui.account;

import android.view.MenuItem;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.account.fragment.BindPhoneFragment;
import com.beitone.medical_store.app.ui.account.fragment.FindPasswordFragment;
import com.beitone.medical_store.app.ui.account.fragment.LoginAuthFragment;
import com.beitone.medical_store.app.ui.account.fragment.LoginFragment;

import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class AccountActivity extends BaseActivity {

    private Fragment currentFragment;

    private LoginFragment mLoginFragment;
    private LoginAuthFragment mLoginAuthFragment;
    private FindPasswordFragment mFindPasswordFragment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_account;
    }

    @Override
    protected void initViewAndData() {
        mLoginAuthFragment = new LoginAuthFragment(loginAuthCallback);
        mLoginFragment = new LoginFragment(loginCallback);
        mFindPasswordFragment = new FindPasswordFragment(findPasswordCallback);
        switchFragment(mLoginAuthFragment).commitAllowingStateLoss();
    }


    private FragmentTransaction switchFragment(Fragment targetFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!targetFragment.isAdded()) {
            if (currentFragment != null) {
                transaction.hide(currentFragment);
            }
            transaction.add(R.id.flAccountContent, targetFragment,
                    targetFragment.getClass().getName());
        } else {
            transaction.hide(currentFragment).show(targetFragment);
        }
        currentFragment = targetFragment;
        return transaction;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            if (currentFragment instanceof LoginAuthFragment){
                onBackPressed();
            } else if (currentFragment instanceof LoginFragment){
                switchFragment(mLoginAuthFragment).commitAllowingStateLoss();
            } else if (currentFragment instanceof FindPasswordFragment){
                switchFragment(mLoginFragment).commitAllowingStateLoss();
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private FindPasswordFragment.Callback findPasswordCallback = new FindPasswordFragment.Callback() {
        @Override
        public void onFindNext() {

        }
    };

    private LoginAuthFragment.Callback loginAuthCallback = new LoginAuthFragment.Callback() {
        @Override
        public void loginSuccess() {

        }

        @Override
        public void loginForPassword() {
            switchFragment(mLoginFragment).commitAllowingStateLoss();
        }
    };

    private LoginFragment.Callback loginCallback = new LoginFragment.Callback() {
        @Override
        public void loginForAuthCode() {
            switchFragment(mLoginAuthFragment).commitAllowingStateLoss();
        }

        @Override
        public void loginForgetPassword() {
            switchFragment(mFindPasswordFragment).commitAllowingStateLoss();
        }

        @Override
        public void loginSuccess() {

        }
    };

    private BindPhoneFragment.Callback bindPhoneCallback = new BindPhoneFragment.Callback() {
        @Override
        public void loginBindSuccess() {

        }
    };

}
