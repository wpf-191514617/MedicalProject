package com.beitone.medical_store.app.ui.user;

import androidx.recyclerview.widget.RecyclerView;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.httpentity.MyRecipelListRequest;
import com.beitone.medical_store.app.util.TestUtil;

import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseRecyclerAdapter;
import cn.betatown.mobile.beitonelibrary.adapter.recyclerview.BaseViewHolderHelper;
import cn.betatown.mobile.beitonelibrary.base.BaseRecyclerActivity;
import cn.betatown.mobile.beitonelibrary.http.BaseProvider;
import cn.betatown.mobile.beitonelibrary.http.HttpRequest;
import cn.betatown.mobile.beitonelibrary.http.callback.OnJsonCallBack;
import cn.betatown.mobile.beitonelibrary.util.Trace;

public class MineMedicineListActivity extends BaseRecyclerActivity {

    @Override
    protected void onRefresh() {
        loadList();
    }

    @Override
    protected void onLoadMore() {
        loadList();
    }

    private void loadList() {
        MyRecipelListRequest listRequest = new MyRecipelListRequest();
        listRequest.current = mCurrentPage;
        listRequest.userId = UserHelper.getInstance().getUserId(this);
        BaseProvider.request(new HttpRequest(listRequest).build(this),
                new OnJsonCallBack() {
            @Override
            public void onResult(Object data) {
                Trace.d("data----" + data);
            }
        });
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();
        setTitle("我的用药");
    }

    @Override
    protected BaseRecyclerAdapter getAdapter() {
        return new MedicineListAdapter(recyclerView);
    }


    class MedicineListAdapter extends BaseRecyclerAdapter<String>{

        public MedicineListAdapter(RecyclerView recyclerView) {
            super(recyclerView, R.layout.item_medicine_1);
        }

        @Override
        protected void fillData(BaseViewHolderHelper helper, int position, String model) {

        }
    }

}
