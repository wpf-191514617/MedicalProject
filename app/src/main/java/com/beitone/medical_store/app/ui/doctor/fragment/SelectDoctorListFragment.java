package com.beitone.medical_store.app.ui.doctor.fragment;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.SortEntity;
import com.beitone.medical_store.app.entity.response.CreateInquiryResponse;
import com.beitone.medical_store.app.entity.response.FindDocResponse;
import com.beitone.medical_store.app.entity.response.TreeFloorResponse;
import com.beitone.medical_store.app.helper.InquiryHelper;
import com.beitone.medical_store.app.httpentity.CreateInquiryRequest;
import com.beitone.medical_store.app.ui.interrogation.SubmitInterrogationOrderActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class SelectDoctorListFragment extends BaseFragment {
    @BindView(R.id.flDoctorList)
    FrameLayout flDoctorList;
    @BindView(R.id.tvQuestion)
    TextView tvQuestion;

    private DoctorListFragment mDoctorListFragment;

    private FindDocResponse.RecordsBean mRecordsBean;

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
        public void onSelectDoctor(FindDocResponse.RecordsBean doctor) {
            mRecordsBean = doctor;
        }
    };

    public void setScreenData(String hospitalLevel, int inquiryType, String docLevel){
        mDoctorListFragment.setScreenData(hospitalLevel , inquiryType , docLevel);
    }

    public void onSort(SortEntity sortType){
        mDoctorListFragment.onSort(sortType);
    }

    public void onSelectDepartment(TreeFloorResponse parentEntity,
                                   TreeFloorResponse.ChildrenBean child){
        mDoctorListFragment.onSelectDepartment(parentEntity , child);
    }


    @OnClick(R.id.tvQuestion)
    public void onViewClicked() {
        if (mRecordsBean == null){
            showToast("请选择学生");
            return;
        }
       String registerId = InquiryHelper.getInquirRegisterId();
        CreateInquiryRequest inquiryRequest = new CreateInquiryRequest();
        inquiryRequest.doctorId = mRecordsBean.getDoctorId();
        inquiryRequest.registerId = registerId;
        BaseProvider.request(new HttpRequest(inquiryRequest).build(getActivity()),
                new OnJsonCallBack<List<CreateInquiryResponse>>() {
            @Override
            public void onResult(List<CreateInquiryResponse> data) {
                if (AdapterUtil.isListNotEmpty(data)){
                    jumpTo(SubmitInterrogationOrderActivity.class);
                }
            }
        });
        // jumpTo(SubmitInterrogationOrderActivity.class);
    }
}
