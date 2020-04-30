package com.beitone.medical_store.app.ui.hospital.dailylist;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class DailyListActivity extends BaseActivity {
    @BindView(R.id.rvDailyList)
    RecyclerView rvDailyList;

    private DailyListAdapter mDailyListAdapter;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_dailylist;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("每日清单");
        rvDailyList.setLayoutManager(new LinearLayoutManager(this));
        mDailyListAdapter = new DailyListAdapter(rvDailyList);
        rvDailyList.setAdapter(mDailyListAdapter);
        mDailyListAdapter.setData(TestUtil.getTestListData(8));
    }

    class DailyListAdapter extends BaseRecyclerAdapter<String>{

        public DailyListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_dailylist);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
