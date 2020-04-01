package com.beitone.medical_store.app.ui.interrogation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;
import com.beitone.medical_store.app.widget.AppButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class SelectSeeDoctorPeopleActivity extends BaseActivity {

    @BindView(R.id.rvSelectPeople)
    RecyclerView rvSelectPeople;
    @BindView(R.id.btnNext)
    AppButton btnNext;
    private SelectArchivesListAdapter mSelectArchivesListAdapter;

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
        mSelectArchivesListAdapter.setData(TestUtil.getTestListData());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_edit) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isEdit", true);
            jumpTo(HealthArchivesActivity.class, bundle);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btnNext)
    public void onViewClicked() {
        if (mSelectArchivesListAdapter.getCheckedPosition() != -1) {
            mSelectArchivesListAdapter.getItem(mSelectArchivesListAdapter.getCheckedPosition());
            jumpTo(DoctorListActivity.class);
        } else {

        }
    }


    class SelectArchivesListAdapter extends BaseRecyclerAdapter<String> {

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
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            if (position != getItemCount() - 1) {
                ImageView ivCheck = helper.getImageView(R.id.ivCheck);
                if (getCheckedPosition() == position) {
                    ivCheck.setSelected(true);
                } else {
                    ivCheck.setSelected(false);
                }
            }
            helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == getItemCount() - 1) {
                        jumpTo(HealthArchivesActivity.class);
                    } else {
                        setCheckedPosition(position);
                    }
                }
            });
        }
    }


}
