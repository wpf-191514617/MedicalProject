package com.beitone.medical.doctor.ui.inquiry.fragment;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.inquiry.MedicalRecordActivity;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;

public class TextInquiryListFragment extends BaseRecyclerFragment {

    private int mCurrentIndex = 0;

    public TextInquiryListFragment(int position){
        mCurrentIndex = position;
    }

    @Override
    protected void onRefresh() {
        setData(DataUtil.getData());
    }

    @Override
    protected void onLoadMore() {
        setData(DataUtil.getData());
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new TextInquiryListAdapter(recyclerView);
    }


    class TextInquiryListAdapter extends BaseRecyclerAdapter<String>{

        public TextInquiryListAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            switch (mCurrentIndex){
                case 0:
                    return R.layout.item_inquiry_text_wait;
                case 1:
                    return R.layout.item_inquiry_text_progress;
                case 2:
                    return R.layout.item_inquiry_text_over;
            }
            return super.getItemViewType(position);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            switch (mCurrentIndex){
                case 0:
                    helper.getView(R.id.btnConsultation).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            jumpTo(MedicalRecordActivity.class);
                        }
                    });
                    break;
            }
        }
    }

}
