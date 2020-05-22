package com.beitone.medical_store.app.ui.home;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.response.DoctorResponse;
import com.beitone.medical_store.app.httpentity.DoctorListRequest;
import com.beitone.medical_store.app.ui.doctor.DoctorHomeActivity;

import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class DoctorListFragment extends BaseFragment {

    RecyclerView mRvList;

    private String mDeptId;

    private String mHospitalId;

    private DoctorListAdapter listAdapter;

    public DoctorListFragment(String deptId, String hospitalId) {
        mDeptId = deptId;
        mHospitalId = hospitalId;
    }

    @Override
    protected int getContentViewLayoutID() {
        return cn.betatown.mobile.beitonelibrary.R.layout.list;
    }

    @Override
    protected void initViewAndData() {
        mRvList = getView().findViewById(R.id.recyclerView);
        mRvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        listAdapter = new DoctorListAdapter(mRvList);
        mRvList.setAdapter(listAdapter);
        listAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                jumpTo(DoctorHomeActivity.class);
            }
        });
        getDocListData();
    }

    private void getDocListData() {
        DoctorListRequest request = new DoctorListRequest();
        request.deptId = mDeptId;
        request.hospitalId = mHospitalId;
        BaseProvider.request(new HttpRequest(request).build(getActivity()),
                new OnJsonCallBack<List<DoctorResponse>>() {
                    @Override
                    public void onResult(List<DoctorResponse> data) {
                        listAdapter.setData(data);
                    }
                });
    }


    class DoctorListAdapter extends BaseRecyclerAdapter<DoctorResponse> {

        public DoctorListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_home_doctor);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, DoctorResponse model) {

            helper.setText(R.id.tvDoctorName, model.getDoctorName())
                    .setText(R.id.tvDoctor, model.getDeptName() + " " + model.getLevel())
                    .setText(R.id.tvHospitalName, model.getHospitalName() + " " + model.getGrade())
                    .setText(R.id.tvSpecialty, "擅长 : " + model.getSpecialty())
                    .setText(R.id.tvSinglePrice, "¥" + model.getTextPrice());
        }
    }

}
