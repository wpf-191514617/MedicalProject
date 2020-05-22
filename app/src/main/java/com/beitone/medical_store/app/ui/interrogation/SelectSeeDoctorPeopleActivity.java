package com.beitone.medical_store.app.ui.interrogation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.response.PatientResponse;
import com.beitone.medical_store.app.helper.InquiryHelper;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.httpentity.PatientListRequest;
import com.beitone.medical_store.app.httpentity.UpdatePatientRequest;
import com.beitone.medical_store.app.ui.doctor.DoctorListActivity;
import com.beitone.medical_store.app.util.SexUtil;
import com.beitone.medical_store.app.util.TestUtil;
import com.beitone.medical_store.app.widget.AppButton;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.IDCardUtil;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class SelectSeeDoctorPeopleActivity extends BaseActivity {

    @BindView(R.id.rvSelectPeople)
    RecyclerView rvSelectPeople;
    @BindView(R.id.btnNext)
    AppButton btnNext;
    private SelectArchivesListAdapter mSelectArchivesListAdapter;

    private boolean isSelectPeople;

    public static final String KEY_SELECT = "selectPeople";

    private final int REQUEST_ADD_PEOPLE = 5;
    private final int REQUEST_EDIT_PEOPLE = 6;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_select_seedocpeople;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("选择就诊人");
        rvSelectPeople.setLayoutManager(new LinearLayoutManager(this));
        mSelectArchivesListAdapter = new SelectArchivesListAdapter(rvSelectPeople);
        rvSelectPeople.setAdapter(mSelectArchivesListAdapter);

        loadPatientList();
    }

    private void loadPatientList() {
        PatientListRequest request = new PatientListRequest();
        request.userId = UserHelper.getInstance().getUserId(this);
        BaseProvider.request(new HttpRequest(request).build(this),
                new OnJsonCallBack<List<PatientResponse>>() {
            @Override
            public void onResult(List<PatientResponse> data) {
                data.add(new PatientResponse());
                mSelectArchivesListAdapter.setData(data);
            }
        });
    }

    @Override
    protected void getBundleExtras(Bundle extras) {
        super.getBundleExtras(extras);
        isSelectPeople = extras.getBoolean(KEY_SELECT, false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_edit) {
            if (mSelectArchivesListAdapter.getCheckedPosition() == -1){
                showToast("请选择患者");
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("isEdit", true);
            PatientResponse response =
                    mSelectArchivesListAdapter.getItem(mSelectArchivesListAdapter.getCheckedPosition());
            bundle.putParcelable("content" , response);
            jumpToForResult(HealthArchivesActivity.class,REQUEST_EDIT_PEOPLE, bundle);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btnNext)
    public void onViewClicked() {
        if (mSelectArchivesListAdapter.getCheckedPosition() != -1) {
            if (isSelectPeople) {
                setResult(RESULT_OK);
                finish();
                return;
            }
            PatientResponse response =
                    mSelectArchivesListAdapter.getItem(mSelectArchivesListAdapter.getCheckedPosition());
            InquiryHelper.inputInquiryPatientId(response.getPatientId());
            updatePatient(response.getPatientId());
            // jumpTo(DoctorListActivity.class);
        } else {
            showToast("请选择患者");
        }
    }

    private void updatePatient(String patientId) {
        UpdatePatientRequest request = new UpdatePatientRequest();
        request.patientId = patientId;
        request.registerId = InquiryHelper.getInquirRegisterId();
        BaseProvider.request(new HttpRequest(request).build(this), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                jumpToThenKill(DoctorListActivity.class);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            switch (requestCode){
                case REQUEST_ADD_PEOPLE:
                case REQUEST_EDIT_PEOPLE:
                    loadPatientList();
                    break;
            }
        }
    }

    class SelectArchivesListAdapter extends BaseRecyclerAdapter<PatientResponse> {

        public SelectArchivesListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            if (position == getItemCount() - 1) {
                return R.layout.item_health_archives_foot;
            }
            return R.layout.item_health_archives;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, PatientResponse model) {
            if (position != getItemCount() - 1) {
                ImageView ivCheck = helper.getImageView(R.id.ivCheck);
                if (getCheckedPosition() == position) {
                    ivCheck.setSelected(true);
                } else {
                    ivCheck.setSelected(false);
                }
                helper.setText(R.id.tvPatientName ,
                        model.getPatientName() + " (" + SexUtil.getSexName(model.getSex())+ ", " + IDCardUtil.getAge(model.getIdCard()) + "岁)");
            }
              helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == getItemCount() - 1) {
                        jumpToForResult(HealthArchivesActivity.class , REQUEST_ADD_PEOPLE);
                    } else {
                        setCheckedPosition(position);
                    }
                }
            });
        }
    }


}
