package com.beitone.medical_store.app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.account.AccountActivity;
import com.beitone.medical_store.app.ui.account.LoginAuthActivity;
import com.beitone.medical_store.app.ui.interrogation.SubmitQuestionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.textView)
    Button textView;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViewAndData() {

    }


    @OnClick(R.id.textView)
    public void onViewClicked() {
        //jumpTo(SubmitQuestionActivity.class);
        jumpTo(AccountActivity.class);
    }


}
