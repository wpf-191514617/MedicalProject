package com.beitone.medical_store.app.ui.doctor.fragment;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.SortEntity;
import com.beitone.medical_store.app.entity.response.FindDocResponse;
import com.beitone.medical_store.app.entity.response.TreeFloorResponse;
import com.beitone.medical_store.app.httpentity.FindDoctorListRequest;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;

public class DoctorListFragment extends BaseRecyclerFragment {

    private OnSelectCallback mOnSelectCallback;

    private FindDoctorListRequest mFindDoctorListRequest = new FindDoctorListRequest();

    public DoctorListFragment(OnSelectCallback onSelectCallback){
        this.mOnSelectCallback = onSelectCallback;
    }

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
        return mAdapter;
    }


    class DoctorListAdapter extends BaseRecyclerAdapter<FindDocResponse.RecordsBean> {

        public DoctorListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_doctor_select);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position,
                                FindDocResponse.RecordsBean model) {

            ImageView ivCheckDoctor = helper.getImageView(R.id.ivCheckDoctor);
            if (getCheckedPosition() == position){
                ivCheckDoctor.setSelected(true);
            } else {
                ivCheckDoctor.setSelected(false);
            }
            helper.setText(R.id.tvDoctorName, model.getDoctorName())
                    .setText(R.id.tvDoctor, model.getDeptName() + " " + model.getLevel())
                    .setText(R.id.tvHospitalName, model.getHospitalName())
                    .setText(R.id.tvHospitalReputation, model.getGrade())
                    .setText(R.id.tvSpecialty, "擅长 : " + model.getSpecialty())
                    .setText(R.id.tvSinglePrice, "¥" + model.getTextPrice());
            ivCheckDoctor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setCheckedPosition(position);
                    if (mOnSelectCallback != null){
                        mOnSelectCallback.onSelectDoctor(model);
                    }
                }
            });
        }
    }


    public interface OnSelectCallback{
        void onSelectDoctor(FindDocResponse.RecordsBean doctor);
    }

}
