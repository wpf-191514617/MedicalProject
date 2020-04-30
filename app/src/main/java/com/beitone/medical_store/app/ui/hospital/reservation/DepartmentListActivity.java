package com.beitone.medical_store.app.ui.hospital.reservation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.ParentEntity;
import com.beitone.medical_store.app.util.TestUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DepartmentListActivity extends BaseActivity {

    @BindView(R.id.rvDepartmentParent)
    RecyclerView rvDepartmentParent;
    @BindView(R.id.rvDepartmentChild)
    RecyclerView rvDepartmentChild;
    private String childName;

    private ParentListAdapter mParentListAdapter;
    private ChildListAdapter mChildListAdapter;
    private List<ParentEntity> mParentEntityList;


    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_department_list;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        childName = "";
        setTitle("预约挂号");
        mParentEntityList = TestUtil.getParentData();
        rvDepartmentParent.setLayoutManager(new LinearLayoutManager(this));
        rvDepartmentChild.setLayoutManager(new LinearLayoutManager(this));

        mParentListAdapter = new ParentListAdapter(rvDepartmentParent);
        rvDepartmentParent.setAdapter(mParentListAdapter);
        mChildListAdapter = new ChildListAdapter(rvDepartmentChild);
        rvDepartmentChild.setAdapter(mChildListAdapter);

        mParentListAdapter.setData(mParentEntityList);
        mChildListAdapter.setData(mParentEntityList.get(0).childList);
        mParentListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                mParentListAdapter.setCheckedPosition(position);
                mChildListAdapter.setData(mParentEntityList.get(position).childList);
            }
        });


        mChildListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                childName = mChildListAdapter.getItem(position);
                mChildListAdapter.notifyDataSetChanged();
            }
        });

    }


    class ParentListAdapter extends BaseRecyclerAdapter<ParentEntity> {

        public ParentListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_parent);
            mCheckedPosition = 0;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, ParentEntity model) {
            TextView textView = helper.getTextView(R.id.tvParentName);
            textView.setText(model.parentName);
            if (position == mCheckedPosition) {
                textView.setSelected(true);
            } else {
                textView.setSelected(false);
            }
        }
    }


    class ChildListAdapter extends BaseRecyclerAdapter<String> {

        public ChildListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_text_select);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            TextView tvTextName = helper.getTextView(R.id.tvTextName);
            ImageView ivTextCheck = helper.getImageView(R.id.ivTextCheck);
            tvTextName.setText(model);
            if (childName.equals(model)) {
                tvTextName.setSelected(true);
                ivTextCheck.setVisibility(View.VISIBLE);
            } else {
                tvTextName.setSelected(false);
                ivTextCheck.setVisibility(View.INVISIBLE);
            }
        }
    }


}
