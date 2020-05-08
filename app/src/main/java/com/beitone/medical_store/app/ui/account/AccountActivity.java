package com.beitone.medical_store.app.ui.account;

import android.view.KeyEvent;
import android.view.MenuItem;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.account.fragment.BindPhoneFragment;
import com.beitone.medical_store.app.ui.account.fragment.FindPasswordFragment;
import com.beitone.medical_store.app.ui.account.fragment.LoginAuthFragment;
import com.beitone.medical_store.app.ui.account.fragment.LoginFragment;
import com.beitone.medical_store.app.ui.account.fragment.SetPasswordFragment;

import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class AccountActivity extends BaseActivity {

    private Fragment currentFragment;

    private LoginFragment mLoginFragment;
    private LoginAuthFragment mLoginAuthFragment;
    private FindPasswordFragment mFindPasswordFragment;
    private SetPasswordFragment mSetPasswordFragment;
    private BindPhoneFragment mBindPhoneFragment;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_account;
    }

    @Override
    protected void initViewAndData() {
        mLoginAuthFragment = new LoginAuthFragment(loginAuthCallback);
        mLoginFragment = new LoginFragment(loginCallback);
        mFindPasswordFragment = new FindPasswordFragment(findPasswordCallback);
        mSetPasswordFragment = new SetPasswordFragment(setPasswordCallback);
        mBindPhoneFragment = new BindPhoneFragment(bindPhoneCallback);
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
            onBack();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void onBack() {
        if (currentFragment instanceof LoginAuthFragment){
            onBackPressed();
        } else if (currentFragment instanceof LoginFragment){
            switchFragment(mLoginAuthFragment).commitAllowingStateLoss();
        } else if (currentFragment instanceof FindPasswordFragment){
            switchFragment(mLoginFragment).commitAllowingStateLoss();
        } else if (currentFragment instanceof SetPasswordFragment){
            if (mSetPasswordFragment.isFromFindPassword()){
                switchFragment(mLoginFragment).commitAllowingStateLoss();
            } else {
                // 首次设置密码
                onBackPressed();
            }
        } else if (currentFragment instanceof BindPhoneFragment){
            switchFragment(mLoginFragment).commitAllowingStateLoss();
        }
    }

    private SetPasswordFragment.Callback setPasswordCallback = new SetPasswordFragment.Callback() {
        @Override
        public void onSetPasswordDone(boolean isFromFindPassword) {
            if (isFromFindPassword){
                switchFragment(mLoginFragment).commitAllowingStateLoss();
            } else {
                onBackPressed();
            }
        }
    };

    private FindPasswordFragment.Callback findPasswordCallback = new FindPasswordFragment.Callback() {
        @Override
        public void onFindNext(String phone, String code) {
            mSetPasswordFragment.registerAndSetPassword(phone , code);
            mSetPasswordFragment.setFromFindPassword(true);
            switchFragment(mSetPasswordFragment).commitAllowingStateLoss();
        }
    };

    private LoginAuthFragment.Callback loginAuthCallback = new LoginAuthFragment.Callback() {
        @Override
        public void loginSuccess() {
            onBackPressed();
        }

        @Override
        public void registerAccount(String mobile, String authCode) {
            mSetPasswordFragment.registerAndSetPassword(mobile , authCode);
            switchFragment(mSetPasswordFragment).commitAllowingStateLoss();
        }

        @Override
        public void loginWith(int type) {
            if (type  == 1){ // 微信登录

            }
            switchFragment(mBindPhoneFragment).commitAllowingStateLoss();
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
            onBackPressed();
        }
    };

    private BindPhoneFragment.Callback bindPhoneCallback = new BindPhoneFragment.Callback() {
        @Override
        public void loginBindSuccess() {
            mSetPasswordFragment.setFromFindPassword(false);
            mSetPasswordFragment.registerAndSetPassword(null , null);
            switchFragment(mSetPasswordFragment).commitAllowingStateLoss();
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            onBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
