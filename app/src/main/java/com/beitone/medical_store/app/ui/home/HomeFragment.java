package com.beitone.medical_store.app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.interrogation.SubmitQuestionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.textView)
    Button textView;
    private Unbinder unbinder;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViewAndData() {

    }


    @OnClick(R.id.textView)
    public void onViewClicked() {
        jumpTo(SubmitQuestionActivity.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
