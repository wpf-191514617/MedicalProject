package com.beitone.medical_store.app.ui.interrogation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.util.TestUtil;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.List;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class AllergensListActivity extends BaseActivity {

    @BindView(R.id.selectFlowLayout)
    TagFlowLayout selectFlowLayout;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_allergenslist;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("输入过敏源");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AllergensListAdapter allergensListAdapter = new AllergensListAdapter(recyclerView);
        recyclerView.setAdapter(allergensListAdapter);
        List<String> data = TestUtil.getSortDatas();
        allergensListAdapter.setData(data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_save , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_save){
            setResult(RESULT_OK);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    class AllergensListAdapter extends BaseRecyclerAdapter<String>{

        public AllergensListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_allergens);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            TagFlowLayout tagFlowLayout = helper.getView(R.id.flowlayout);
            tagFlowLayout.setAdapter(new TagAdapter<String>(TestUtil.getTags()) {
                @Override
                public View getView(FlowLayout parent, int position, String o) {
                    TextView tv = (TextView) LayoutInflater.from(mContext).inflate(R.layout.item_allergen ,
                            tagFlowLayout , false);
                    tv.setText(o);
                    return tv;
                }
            });
        }
    }

}
