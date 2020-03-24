package cn.betatown.mobile.beitonelibrary.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.betatown.mobile.beitonelibrary.R;
import cn.betatown.mobile.beitonelibrary.bean.EventData;
import cn.betatown.mobile.beitonelibrary.viewcontroller.callback.BaseView;
import me.jessyan.autosize.internal.CustomAdapt;

public abstract class BaseFragment extends BToneFragment implements BaseView, CustomAdapt {


    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isRegisterEventBus()) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (isRegisterEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Subscribe
    public void onEventMainThread(EventData eventData) {
        if (null != eventData) {
            onEventComming(eventData);
        }
    }

    protected void onEventComming(EventData eventData) {
    }


    protected boolean isRegisterEventBus() {
        return false;
    }

    @Override
    public void showLoading() {
        switchView("加载中...", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickReload();
            }
        });
    }

    @Override
    public void showError(String msg) {
//        switchView(msg, R.drawable.search_no_content, new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReload();
//            }
//        });
    }

    @Override
    public void showNetError() {
        switchView("连接不到网络,请检查网络之后重试", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickReload();
            }
        });
    }

    @Override
    public void showNormal() {
//        switchView("", R.drawable.ic_nodata1, new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClickReload();
//            }
//        });
    }

    @Override
    public boolean isBaseOnWidth() {
        return false;
    }

    @Override
    public float getSizeInDp() {
        return 667;
    }


    protected void onClickReload() {

    }


    public void setText(TextView tv, String value) {
        if (TextUtils.isEmpty(value)) {
            value = "";
        }
        tv.setText(value);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
