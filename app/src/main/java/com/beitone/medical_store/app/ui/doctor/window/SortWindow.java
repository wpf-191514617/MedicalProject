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
import com.beitone.medical_store.app.entity.SortEntity;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.util.Utils;
import cn.betatown.mobile.beitonelibrary.widget.BasePopupWindow;

import static android.view.View.MeasureSpec.AT_MOST;

public class SortWindow extends BasePopupWindow {

    private OnSelectSortListener mOnSelectSortListener;

    private RecyclerView rvSort;

    private SortListAdapter mSortListAdapter;

    public SortWindow(Context context, OnSelectSortListener onSelectSortListener) {
        super(context);
        mOnSelectSortListener = onSelectSortListener;
    }

    @Override
    public View initView() {
        View contentView =
                LayoutInflater.from(getContext()).inflate(R.layout.layout_sort_window, null);
        rvSort = contentView.findViewById(R.id.rvSort);
        final int maxHeight = mContext.getResources().getDimensionPixelSize(R.dimen.dimen_217dp);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext()) {
            @Override
            public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
                super.setMeasuredDimension(childrenBounds, wSpec,
                        View.MeasureSpec.makeMeasureSpec(maxHeight, AT_MOST));
            }
        };
        rvSort.setLayoutManager(linearLayoutManager);
        mSortListAdapter = new SortListAdapter(rvSort);
        rvSort.setAdapter(mSortListAdapter);
        mSortListAdapter.setData(TestUtil.getSortDatas());
        mSortListAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                mSortListAdapter.setCheckedPosition(position);
                if (mOnSelectSortListener != null){
                    mOnSelectSortListener.onSort(mSortListAdapter.getItem(position));
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



    class SortListAdapter extends BaseRecyclerAdapter<SortEntity>{

        public SortListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_text_select);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, SortEntity model) {
            TextView tvTextName = helper.getTextView(R.id.tvTextName);
            ImageView ivTextCheck = helper.getImageView(R.id.ivTextCheck);
            helper.setText(tvTextName , model.content);
            if (mCheckedPosition == position){
                tvTextName.setSelected(true);
                ivTextCheck.setVisibility(View.VISIBLE);
            } else {
                tvTextName.setSelected(false);
                ivTextCheck.setVisibility(View.INVISIBLE);
            }
        }
    }


    public interface OnSelectSortListener{
        void onSort(SortEntity sortEntity);
    }

}
