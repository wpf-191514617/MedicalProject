package com.beitone.medical.doctor.ui.patient;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical.doctor.DataUtil;
import com.beitone.medical.doctor.R;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;

public class ReportDetailActivity extends BaseRecyclerActivity {

    @Override
    protected void onRefresh() {
        setData(DataUtil.getData(4));
        refreshLayout.setEnableLoadMore(false);
    }

    @Override
    protected void onLoadMore() {

    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        setTitle("检查报告详情");
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new ReportDetailAdapter(recyclerView);
    }

    class ReportDetailAdapter extends BaseRecyclerAdapter<String> {

        public ReportDetailAdapter(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override
        public int getItemViewType(int position) {
            if (position == getItemCount() - 1) {
                return R.layout.item_report_foot;
            }
            return R.layout.item_report_item;
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            if (position == getItemCount() - 1) {
                return;
            }
            TextView tvItemLable = helper.getTextView(R.id.tvItemLable);
            TextView tvItemContent = helper.getTextView(R.id.tvItemContent);
            switch (position) {
                case 0:
                    setText(tvItemLable, "检查项目");
                    setText(tvItemContent, "胸部CT");
                    break;
                case 1:
                    setText(tvItemLable, "影像所见");
                    setText(tvItemContent,
                            "胸廊对称，气管纵隔居中。双肺纹理增多。左肺下叶支气管管壁增厚，管腔扩张。右肺中叶近肺门处见一三角形实变影，右肺中叶肺组织膨胀不全。右肺下叶见小片状高密度影，边缘模糊。纵隔内未见肿大淋巴结。双侧胸膜无增厚，胸腔内未见积液征。扫描野内肝右叶实质内见两个类圆形钙化灶。");
                    break;
                case 2:
                    setText(tvItemLable, "检查诊断");
                    setText(tvItemContent, "右肺中叶不扩张，建议治疗后复查右肺炎症左肺下叶支气管扩张。肝脏钙化灶");
                    break;
            }
        }
    }


}
