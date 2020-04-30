package com.beitone.medical_store.app.ui.home;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.user.MineDoctorActivity;
import com.beitone.medical_store.app.ui.user.MineInquiryListActivity;
import com.beitone.medical_store.app.ui.user.MineMedicineListActivity;
import com.beitone.medical_store.app.ui.user.MineReportListActivity;
import com.beitone.medical_store.app.ui.user.ReservationListActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import de.hdodenhof.circleimageview.CircleImageView;

public class MineFragment extends BaseFragment {

    @BindView(R.id.civUserAvatar)
    CircleImageView civUserAvatar;
    @BindView(R.id.tvUserNickName)
    TextView tvUserNickName;
    @BindView(R.id.tvUserPerfectInfo)
    TextView tvUserPerfectInfo;
    @BindView(R.id.layoutSetting)
    LinearLayout layoutSetting;
    @BindView(R.id.tvPreDeposit)
    TextView tvPreDeposit;
    @BindView(R.id.tvStoreCoupon)
    TextView tvStoreCoupon;
    @BindView(R.id.tvPlatformCoupon)
    TextView tvPlatformCoupon;
    @BindView(R.id.tvIntegral)
    TextView tvIntegral;
    @BindView(R.id.layoutOrderAll)
    LinearLayout layoutOrderAll;
    @BindView(R.id.layoutOrderWaitPay)
    LinearLayout layoutOrderWaitPay;
    @BindView(R.id.layoutOrderWaitPull)
    LinearLayout layoutOrderWaitPull;
    @BindView(R.id.layoutOrderComment)
    LinearLayout layoutOrderComment;
    @BindView(R.id.layoutReservation)
    LinearLayout layoutReservation;
    @BindView(R.id.layoutInquiry)
    LinearLayout layoutInquiry;
    @BindView(R.id.layoutMedication)
    LinearLayout layoutMedication;
    @BindView(R.id.layoutMineDoctor)
    LinearLayout layoutMineDoctor;
    @BindView(R.id.layoutMineReport)
    LinearLayout layoutMineReport;
    @BindView(R.id.vpMineHealth)
    ViewPager vpMineHealth;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initViewAndData() {

    }

    @OnClick({R.id.tvUserPerfectInfo, R.id.layoutSetting, R.id.layoutOrderAll,
            R.id.layoutOrderWaitPay, R.id.layoutOrderWaitPull, R.id.layoutOrderComment,
            R.id.layoutReservation, R.id.layoutInquiry, R.id.layoutMedication,
            R.id.layoutMineDoctor, R.id.layoutMineReport})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvUserPerfectInfo:
                break;
            case R.id.layoutSetting:
                break;
            case R.id.layoutOrderAll:
                break;
            case R.id.layoutOrderWaitPay:
                break;
            case R.id.layoutOrderWaitPull:
                break;
            case R.id.layoutOrderComment:
                break;
            case R.id.layoutReservation:
                jumpTo(ReservationListActivity.class);
                break;
            case R.id.layoutInquiry:
                jumpTo(MineInquiryListActivity.class);
                break;
            case R.id.layoutMedication:
                jumpTo(MineMedicineListActivity.class);
                break;
            case R.id.layoutMineDoctor:
                jumpTo(MineDoctorActivity.class);
                break;
            case R.id.layoutMineReport:
                jumpTo(MineReportListActivity.class);
                break;
        }
    }
}
