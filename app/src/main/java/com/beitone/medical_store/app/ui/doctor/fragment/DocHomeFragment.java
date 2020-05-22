package com.beitone.medical_store.app.ui.doctor.fragment;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.DoctorHomeEntity;
import com.beitone.medical_store.app.entity.response.DoctorInfoResponse;
import com.beitone.medical_store.app.httpentity.DocEvaluationRequest;
import com.beitone.medical_store.app.httpentity.DoctorInfoRequest;
import com.beitone.medical_store.app.ui.doctor.DoctorSummrayActivity;

import java.util.ArrayList;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class DocHomeFragment extends BaseRecyclerFragment {
    List<DoctorHomeEntity> homeEntities;

    private String doctorId;
    private String hospitalId;

    public DocHomeFragment(String docId , String hospitalId){
        this.doctorId = docId;
        this.hospitalId = hospitalId;
    }

    @Override
    protected void onRefresh() {
        homeEntities = new ArrayList<>();
        homeEntities.add(new DoctorHomeEntity(1));
        homeEntities.add(new DoctorHomeEntity(2));
        homeEntities.add(new DoctorHomeEntity(3));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        setData(homeEntities);
        loadDocInfo();
    }

    @Override
    protected void onLoadMore() {
       /* homeEntities = new ArrayList<>();
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        homeEntities.add(new DoctorHomeEntity(4));
        mAdapter.addMoreData(homeEntities);
        finishLoad();*/
    }


    private void loadDocInfo() {
        refreshLayout.setEnableLoadMore(false);
        DoctorInfoRequest infoRequest = new DoctorInfoRequest();
        infoRequest.doctorId = doctorId;
        infoRequest.hospitalId = hospitalId;
        BaseProvider.request(new HttpRequest(infoRequest).build(getActivity()),
                new OnJsonCallBack<DoctorInfoResponse>() {
            @Override
            public void onResult(DoctorInfoResponse data) {
                getEvaluation(data);
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                getEvaluation(null);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                getEvaluation(null);
            }
        });
    }

    private void getEvaluation(DoctorInfoResponse data) {
        DocEvaluationRequest request = new DocEvaluationRequest();
        request.doctorId = doctorId;
        request.hospitalId = hospitalId;
        BaseProvider.request(new HttpRequest(request).build(getActivity()), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {

            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
            }
        });
    }


    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        refreshLayout.autoRefresh(300);
    }


    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new DocHomeAdapter(recyclerView);
    }



    class DocHomeAdapter extends BaseRecyclerAdapter<DoctorHomeEntity>{

        public DocHomeAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            switch (getItem(position).type){
                case 1:
                    return R.layout.item_doctor_head;
                case 2:
                    return R.layout.item_dochome_2;
                case 3:
                    return R.layout.item_lable;
            }
            return R.layout.item_doctor_reviews;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, DoctorHomeEntity model) {
            switch (model.type){
                case 1:
                    helper.getView(R.id.tvGoSummary).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(DoctorSummrayActivity.class);
                        }
                    });
                    break;
            }
        }
    }

}
