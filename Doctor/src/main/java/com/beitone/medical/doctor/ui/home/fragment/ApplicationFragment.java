package com.beitone.medical.doctor.ui.home.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.inquiry.TextInquiryHomeActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;

public class ApplicationFragment extends BaseFragment {
    @BindView(R.id.tvHospitalName)
    TextView tvHospitalName;
    @BindView(R.id.layoutInquiryText)
    LinearLayout layoutInquiryText;
    @BindView(R.id.layoutWorkStation)
    LinearLayout layoutWorkStation;
    @BindView(R.id.layoutFollowUp)
    LinearLayout layoutFollowUp;
    @BindView(R.id.layoutInquiryText1)
    LinearLayout layoutInquiryText1;
    @BindView(R.id.layoutInquiryVideo)
    LinearLayout layoutInquiryVideo;
    @BindView(R.id.layoutInquiryPhone)
    LinearLayout layoutInquiryPhone;
    @BindView(R.id.layoutWorkStation1)
    LinearLayout layoutWorkStation1;
    @BindView(R.id.layoutHospitalized)
    LinearLayout layoutHospitalized;
    @BindView(R.id.layoutMeeting)
    LinearLayout layoutMeeting;
    @BindView(R.id.layoutSurgery)
    LinearLayout layoutSurgery;
    @BindView(R.id.tvTitle)
    TextView tvTitle;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_application;
    }

    @Override
    protected void initViewAndData() {
        setText(tvTitle , "应用");
    }

    @OnClick({R.id.layoutInquiryText, R.id.layoutWorkStation, R.id.layoutFollowUp,
            R.id.layoutInquiryText1, R.id.layoutInquiryVideo, R.id.layoutInquiryPhone,
            R.id.layoutWorkStation1, R.id.layoutHospitalized, R.id.layoutMeeting,
            R.id.layoutSurgery})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layoutInquiryText:
            case R.id.layoutInquiryText1:
                jumpTo(TextInquiryHomeActivity.class);
                break;
            case R.id.layoutWorkStation:
            case R.id.layoutWorkStation1:
                break;
            case R.id.layoutFollowUp:
                break;
            case R.id.layoutInquiryVideo:
                break;
            case R.id.layoutInquiryPhone:
                break;
            case R.id.layoutHospitalized:
                break;
            case R.id.layoutMeeting:
                break;
            case R.id.layoutSurgery:
                break;
        }
    }
}