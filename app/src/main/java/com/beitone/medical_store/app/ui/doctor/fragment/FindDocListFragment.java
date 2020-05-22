package com.beitone.medical_store.app.ui.doctor.fragment;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.SortEntity;
import com.beitone.medical_store.app.entity.response.FindDocResponse;
import com.beitone.medical_store.app.entity.response.TreeFloorResponse;
import com.beitone.medical_store.app.httpentity.FindDoctorListRequest;
import com.beitone.medical_store.app.ui.doctor.DoctorHomeActivity;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class FindDocListFragment extends BaseRecyclerFragment {

    private FindDoctorListRequest mFindDoctorListRequest = new FindDoctorListRequest();

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
    }

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    public void setScreenData(String hospitalLevel, int inquiryType, String docLevel) {
        mFindDoctorListRequest.queryParams.business = String.valueOf(inquiryType);
        mFindDoctorListRequest.queryParams.hospitalGrade = hospitalLevel;
        mFindDoctorListRequest.queryParams.level = docLevel;
        refreshLayout.autoRefresh(200);
    }

    public void onSort(SortEntity sortType) {
        mFindDoctorListRequest.queryParams.sortBy = sortType.sort;
        refreshLayout.autoRefresh(200);
    }

    public void onSelectDepartment(TreeFloorResponse parentEntity,
                                   TreeFloorResponse.ChildrenBean child) {
        mFindDoctorListRequest.queryParams.deptId = child.getId();
        mFindDoctorListRequest.queryParams.deptName = child.getDeptName();
        refreshLayout.autoRefresh(200);
    }


    private void loadList() {
        mFindDoctorListRequest.queryParams.current = mCurrentPage;
        BaseProvider.request(new HttpRequest(mFindDoctorListRequest).build(getActivity())
                , new OnJsonCallBack<FindDocResponse>() {
                    @Override
                    public void onResult(FindDocResponse data) {
                        finishLoad();
                        if (data != null) {
                            setData(data.getRecords());
                        }
                    }

                    @Override
                    public void onError(String msg) {
                        super.onError(msg);
                        finishLoad();
                        showToast(msg);
                    }

                    @Override
                    public void onFailed(String msg) {
                        super.onFailed(msg);
                        finishLoad();
                        showToast(msg);
                    }
                });
    }

    @Override
    protected void initLayoutManager() {
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(new ColorDrawable(ContextCompat.getColor(getActivity(),
                R.color.grayDE)));
        recyclerView.addItemDecoration(itemDecoration);
        super.initLayoutManager();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        mAdapter = new DoctorListAdapter(recyclerView);
        mAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                FindDocResponse.RecordsBean recordsBean = (FindDocResponse.RecordsBean) mAdapter.getData().get(position);
                Bundle bundle = new Bundle();
                bundle.putString(DoctorHomeActivity.KEY_DOCTORID, recordsBean.getDoctorId());
                bundle.putString(DoctorHomeActivity.KEY_HOSPITALID , recordsBean.getHospitalId());
                jumpTo(DoctorHomeActivity.class , bundle);
            }
        });
        return mAdapter;
    }


    class DoctorListAdapter extends BaseRecyclerAdapter<FindDocResponse.RecordsBean>{

        public DoctorListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_home_doctor);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, FindDocResponse.RecordsBean model) {
            helper.setText(R.id.tvDoctorName, model.getDoctorName())
                    .setText(R.id.tvDoctor, model.getDeptName() + " " + model.getLevel())
                    .setText(R.id.tvHospitalName, model.getHospitalName() + " " + model.getGrade())
                    .setText(R.id.tvSpecialty, "擅长 : " + model.getSpecialty())
                    .setText(R.id.tvSinglePrice, "¥" + model.getTextPrice());
        }
    }



}
