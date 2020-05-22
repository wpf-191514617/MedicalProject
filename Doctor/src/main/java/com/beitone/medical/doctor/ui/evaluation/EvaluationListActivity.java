package com.beitone.medical.doctor.ui.evaluation;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.beitone.medical.doctor.R;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;

public class EvaluationListActivity extends BaseActivity {

    @BindView(R.id.tagFlowLayout)
    TagFlowLayout tagFlowLayout;


    private String[] tagList = {"查看全部", "图文问诊(20)", "视频问诊(20)", "电话问诊(20)", "好评(97%)", "一般(2%)",
            "差评(1%)"};

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_evaluation_list;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        setTitle("用户评价");
        MyTagAdapter myTagAdapter = new MyTagAdapter(Arrays.asList(tagList));
        tagFlowLayout.setAdapter(myTagAdapter);
        myTagAdapter.setSelectedList(0);
        EvaluationListFragment listFragment = new EvaluationListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flEvaluationContent ,
                listFragment).commitNowAllowingStateLoss();
        tagFlowLayout.setOnSelectListener(new TagFlowLayout.OnSelectListener() {
            @Override
            public void onSelected(Set<Integer> selectPosSet) {
                listFragment.refreshData();
            }
        });
    }


    class MyTagAdapter extends TagAdapter<String>{

        public MyTagAdapter(List<String> datas) {
            super(datas);
        }

        @Override
        public View getView(FlowLayout parent, int position, String s) {
            TextView textView =
                    (TextView) LayoutInflater.from(EvaluationListActivity.this)
                            .inflate(R.layout.item_tag, tagFlowLayout, false);
            textView.setText(s);
            return textView;
        }
    }

}
