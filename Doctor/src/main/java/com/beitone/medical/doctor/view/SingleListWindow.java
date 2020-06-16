package com.beitone.medical.doctor.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.R;

import java.util.List;

import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.widget.BasePopupWindow;

import static android.view.View.MeasureSpec.AT_MOST;

public class SingleListWindow extends BasePopupWindow {

    private RecyclerView recyclerView;

    private SingleListAdapter listAdapter;
    private List<String> mDatas;

    private OnSingleSelectListener onSingleSelectListener;

    public SingleListWindow(Context context , List<String> stringList , OnSingleSelectListener singleSelectListener) {
        super(context);
        mDatas = stringList;
        this.onSingleSelectListener = singleSelectListener;
    }

    @Override
    public View initView() {
        View contentView =
                LayoutInflater.from(getContext()).inflate(R.layout.layout_single_list_window, null);
        recyclerView = contentView.findViewById(R.id.recyclerView);
        /*final int maxHeight = mContext.getResources().getDimensionPixelSize(R.dimen.dimen_200dp);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext()) {
            @Override
            public void setMeasuredDimension(Rect childrenBounds, int wSpec, int hSpec) {
                super.setMeasuredDimension(childrenBounds, wSpec,
                        View.MeasureSpec.makeMeasureSpec(maxHeight, AT_MOST));
            }
        };*/
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listAdapter = new SingleListAdapter(recyclerView);
        recyclerView.setAdapter(listAdapter);
        mFrameLayout.setBackgroundColor(Color.parseColor("#00000000"));
        contentView.findViewById(R.id.v_outside).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        listAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                if (onSingleSelectListener != null){
                    onSingleSelectListener.onItemSelect(position , listAdapter.getItem(position));
                }
            }
        });
        return contentView;
    }

    public void setDatas(List<String> datas){
        listAdapter.setData(mDatas);
    }


    class SingleListAdapter extends BaseRecyclerAdapter<String>{

        public SingleListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_text);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            helper.setText(R.id.tvText , model);
        }
    }

    public interface OnSingleSelectListener{
        void onItemSelect(int position , String data);
    }

}
