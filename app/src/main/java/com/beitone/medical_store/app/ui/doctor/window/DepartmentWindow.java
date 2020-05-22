package com.beitone.medical_store.app.ui.doctor.window;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.entity.ParentEntity;
import com.beitone.medical_store.app.entity.response.TreeFloorResponse;
import com.beitone.medical_store.app.util.TestUtil;

import java.util.ArrayList;
import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.AdapterUtil;
import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.util.Utils;
import cn.betatown.mobile.beitonelibrary.widget.BasePopupWindow;

import static android.view.View.MeasureSpec.AT_MOST;

public class DepartmentWindow extends BasePopupWindow {

    private RecyclerView rvDepartmentParent, rvDepartmentChild;

    private List<ParentEntity> mParentEntityList;

    private ParentListAdapter mParentListAdapter;
    private ChildListAdapter mChildListAdapter;

    private TreeFloorResponse.ChildrenBean childName;

    private OnSelectDepartmentListener mOnSelectDepartmentListener;

    public DepartmentWindow(Context context, OnSelectDepartmentListener selectDepartmentListener) {
        super(context);
        mOnSelectDepartmentListener = selectDepartmentListener;
    }


    private List<TreeFloorResponse> mFloorResponseList;

    public void setFloorResponseList(List<TreeFloorResponse> mFloorResponseList) {
        if (!AdapterUtil.isListNotEmpty(mFloorResponseList)){
            mParentListAdapter.clear();
            mChildListAdapter.clear();
            return;
        }
        this.mFloorResponseList = mFloorResponseList;
        mParentListAdapter.setData(mFloorResponseList);
        mChildListAdapter.setData(mFloorResponseList.get(0).getChildren());
    }

    @Override
    public View initView() {
        mParentEntityList = TestUtil.getParentData();

        View contentView =
                LayoutInflater.from(getContext()).inflate(R.layout.layout_department_window, null);
        rvDepartmentParent = contentView.findViewById(R.id.rvDepartmentParent);
        rvDepartmentChild = contentView.findViewById(R.id.rvDepartmentChild);
        final int maxHeight = Utils.dp2px(getContext(), 500);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext()) {
            @Override
            public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
                super.setMeasuredDimension(childrenBounds, wSpec,
                        View.MeasureSpec.makeMeasureSpec(maxHeight, AT_MOST));
            }
        };
        rvDepartmentParent.setLayoutManager(linearLayoutManager);
        linearLayoutManager = new LinearLayoutManager(getContext()) {
            @Override
            public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
                super.setMeasuredDimension(childrenBounds, wSpec,
                        View.MeasureSpec.makeMeasureSpec(maxHeight, AT_MOST));
            }
        };
        rvDepartmentChild.setLayoutManager(linearLayoutManager);

        mParentListAdapter = new ParentListAdapter(rvDepartmentParent);
        rvDepartmentParent.setAdapter(mParentListAdapter);
        mChildListAdapter = new ChildListAdapter(rvDepartmentChild);
        rvDepartmentChild.setAdapter(mChildListAdapter);


        mParentListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                mParentListAdapter.setCheckedPosition(position);
                mChildListAdapter.setData(mParentListAdapter.getData().get(position).getChildren());
               // mChildListAdapter.setData(mParentEntityList.get(position).childList);
            }
        });
        mChildListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                if (mOnSelectDepartmentListener != null) {
                    childName = mChildListAdapter.getItem(position);
                    mChildListAdapter.notifyDataSetChanged();
                    mOnSelectDepartmentListener.onSelectDepartment(mParentListAdapter.getData().get(mParentListAdapter.getCheckedPosition()),
                            mChildListAdapter.getItem(position));
                }
                dismiss();
            }
        });

        contentView.findViewById(R.id.v_outside).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return contentView;
    }


    class ParentListAdapter extends BaseRecyclerAdapter<TreeFloorResponse> {

        public ParentListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_parent);
            mCheckedPosition = 0;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, TreeFloorResponse model) {
            TextView textView = helper.getTextView(R.id.tvParentName);
            helper.setText(textView , model.getDeptName());
            if (position == mCheckedPosition) {
                textView.setSelected(true);
            } else {
                textView.setSelected(false);
            }
        }
    }


    class ChildListAdapter extends BaseRecyclerAdapter<TreeFloorResponse.ChildrenBean> {

        public ChildListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_text_select);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position,
                                TreeFloorResponse.ChildrenBean model) {
            TextView tvTextName = helper.getTextView(R.id.tvTextName);
            ImageView ivTextCheck = helper.getImageView(R.id.ivTextCheck);
            helper.setText(tvTextName , model.getDeptName());
            if (childName != null && childName.equals(model)) {
                tvTextName.setSelected(true);
                ivTextCheck.setVisibility(View.VISIBLE);
            } else {
                tvTextName.setSelected(false);
                ivTextCheck.setVisibility(View.INVISIBLE);
            }
        }
    }


    public interface OnSelectDepartmentListener {
        void onSelectDepartment(TreeFloorResponse floorResponse, TreeFloorResponse.ChildrenBean child);
    }

}
