package com.beitone.medical_store.app.ui.interrogation.fragment;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.interrogation.SubmitInterrogationOrderActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class SelectDoctorListFragment extends BaseFragment {
    @BindView(R.id.flDoctorList)
    FrameLayout flDoctorList;
    @BindView(R.id.tvQuestion)
    TextView tvQuestion;

    private DoctorListFragment mDoctorListFragment;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_selectdoctor;
    }

    @Override
    protected void initViewAndData() {
        mDoctorListFragment = new DoctorListFragment(onSelectCallback);
        getChildFragmentManager().beginTransaction().add(R.id.flDoctorList, mDoctorListFragment).commitAllowingStateLoss();
    }

    private DoctorListFragment.OnSelectCallback onSelectCallback =
            new DoctorListFragment.OnSelectCallback() {
        @Override
        public void onSelectDoctor(String doctor) {

        }
    };

    @OnClick(R.id.tvQuestion)
    public void onViewClicked() {
        jumpTo(SubmitInterrogationOrderActivity.class);
    }
}
