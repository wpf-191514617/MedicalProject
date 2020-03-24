package com.beitone.medical_store.app.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.betatown.mobile.beitonelibrary.adapter.listener.OnRecyclerItemClickListener;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;

public class SingleSelectDialog extends Dialog {

    private final OnSingleSelectListener mOnSingleSelectListener;
    private List<String> mData;
    TextView tvCancel;
    RecyclerView rvData;

    private TextAdapter mTextAdapter;

    public SingleSelectDialog(@NonNull Context context, List<String> data,
                              OnSingleSelectListener onSingleSelectListener) {
        super(context, R.style.ActionSheetDialogStyle);
        this.mData = data;
        this.mOnSingleSelectListener = onSingleSelectListener;
        initView(context);
    }

    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_singlelist, null);
        ButterKnife.bind(contentView);
        setContentView(contentView);

        rvData = contentView.findViewById(R.id.rvData);
        tvCancel = contentView.findViewById(R.id.tvCancel);
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        layoutParams.width = context.getResources().getDisplayMetrics().widthPixels;
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        contentView.setLayoutParams(layoutParams);
        getWindow().setGravity(Gravity.BOTTOM);
        getWindow().setWindowAnimations(R.style.BottomDialog_Animation);
        mTextAdapter = new TextAdapter(rvData);
        rvData.setLayoutManager(new LinearLayoutManager(context));
        rvData.setAdapter(mTextAdapter);
        mTextAdapter.setData(mData);
        mTextAdapter.setOnRVItemClickListener(new OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View itemView, int position) {
                if (mOnSingleSelectListener != null){
                    mOnSingleSelectListener.onSingleSelect(position , mTextAdapter.getItem(position));
                    dismiss();
                }
            }
        });
    }


    class TextAdapter extends BaseRecyclerAdapter<String>{

        public TextAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_singletext);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            helper.setText(R.id.tvText , model);
        }
    }


    public interface OnSingleSelectListener{
        void onSingleSelect(int position, String data);
    }


}
