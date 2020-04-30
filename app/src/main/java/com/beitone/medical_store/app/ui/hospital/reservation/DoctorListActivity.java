package com.beitone.medical_store.app.ui.hospital.reservation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.DepartmentEntity;
import com.beitone.medical_store.app.util.TestUtil;

import net.shopnc.b2b2c.android.custom.MyGridView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DoctorListActivity extends BaseActivity {

    @BindView(R.id.layoutSearch)
    LinearLayout layoutSearch;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private DocListAdapter mDocListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_reservation_doclist;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("医生列表");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDocListAdapter = new DocListAdapter(recyclerView);
        recyclerView.setAdapter(mDocListAdapter);
        mDocListAdapter.setData(TestUtil.getTestListData());
    }


    @OnClick(R.id.layoutSearch)
    public void onViewClicked() {
    }


    class DocListAdapter extends BaseRecyclerAdapter<String>{

        public DocListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            if (position == 0){
                return R.layout.item_reservation_doclist_head;
            }
            return R.layout.item_reservation_doc;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            if (position == 0){
                MyGridView myGridView = helper.getView(R.id.gridReservation);
                myGridView.setAdapter(new GridAdapter(mContext ,
                        TestUtil.getDepartmentEntityList(mContext)));
                myGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i==7){
                            jumpTo(DepartmentListActivity.class);
                        }
                    }
                });
            } else {
                helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jumpTo(DoctorHomeActivity.class);
                    }
                });
            }
        }
    }


    class GridAdapter extends BaseAdapter{

        private List<DepartmentEntity> mDepartmentEntities;

        private Context mContext;

        public GridAdapter(Context context , List<DepartmentEntity> entityList){
            mDepartmentEntities = entityList;
            mContext = context;
        }


        @Override
        public int getCount() {
            return 8;
        }

        @Override
        public Object getItem(int i) {
            return mDepartmentEntities.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder = null;
            if (view == null){
                view = LayoutInflater.from(mContext).inflate(R.layout.item_department , null);
                viewHolder = new ViewHolder();
                viewHolder.ivIcon = view.findViewById(R.id.ivDepartmentIcon);
                viewHolder.tvName = view.findViewById(R.id.tvDepartmentName);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            DepartmentEntity departmentEntity = mDepartmentEntities.get(i);
            viewHolder.ivIcon.setImageResource(departmentEntity.icon);
            viewHolder.tvName.setText(departmentEntity.name);
            return view;
        }

        class ViewHolder {
            ImageView ivIcon;
            TextView tvName;
        }

    }

}
