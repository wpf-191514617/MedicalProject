package com.beitone.medical_store.app.ui.user;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.httpentity.InquiryListRequest;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerFragment;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class InquiryListFragment extends BaseRecyclerFragment {

    private String key;

    public InquiryListFragment(String keys) {
        this.key = keys;
    }

    @Override
    protected void onRefresh() {
        //setData(TestUtil.getTestListData(10));
        loadInquiryList();
    }

    @Override
    protected void onLoadMore() {
       // setData(TestUtil.getTestListData(10));
    }

    private void loadInquiryList(){
        refreshLayout.setEnableLoadMore(false);
        InquiryListRequest listRequest = new InquiryListRequest();
        listRequest.status = key;
        listRequest.userId = UserHelper.getInstance().getUserId(getActivity());
        BaseProvider.request(new HttpRequest(listRequest).build(getActivity()), new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                Trace.d("data--" + data);
            }

            @Override
            public void onError(String msg) {
                super.onError(msg);
                showToast(msg);
            }

            @Override
            public void onFailed(String msg) {
                super.onFailed(msg);
                showToast(msg);
            }
        });
    }


    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new InquiryListAdapter(recyclerView);
    }


    class InquiryListAdapter extends BaseRecyclerAdapter<String>{

        public InquiryListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_inquiry);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {
            helper.getConvertView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jumpTo(InquiryDetailActivity.class);
                }
            });
        }
    }

}
