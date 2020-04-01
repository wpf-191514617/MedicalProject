package com.beitone.medical_store.app.ui.interrogation.fragment;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class DoctorListFragment extends BaseRecyclerFragment {

    private OnSelectCallback mOnSelectCallback;

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

    private void loadList() {
        setData(TestUtil.getTestListData());
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


    class DoctorListAdapter extends BaseRecyclerAdapter<String>{

        public DoctorListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_doctor_select);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

            ImageView ivCheckDoctor = helper.getImageView(R.id.ivCheckDoctor);
            if (getCheckedPosition() == position){
                ivCheckDoctor.setSelected(true);
            } else {
                ivCheckDoctor.setSelected(false);
            }
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
        void onSelectDoctor(String doctor);
    }

}
