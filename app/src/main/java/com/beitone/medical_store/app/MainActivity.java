package com.beitone.medical_store.app;

import android.widget.FrameLayout;

import com.beitone.medical_store.app.constant.EventCode;
import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.ui.account.AccountActivity;
import com.beitone.medical_store.app.ui.home.FindFragment;
import com.beitone.medical_store.app.ui.home.HomeFragment;
import com.beitone.medical_store.app.ui.home.MessageFragment;
import com.beitone.medical_store.app.ui.home.MineFragment;
import com.beitone.medical_store.app.ui.home.ShopCartFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.bean.EventData;
import cn.betatown.mobile.beitonelibrary.util.Trace;
import cn.betatown.mobile.beitonelibrary.widget.BmMainNavigateTabBar;

public class MainActivity extends BaseActivity {

    @BindView(R.id.layoutHomeContent)
    FrameLayout layoutHomeContent;
    @BindView(R.id.mainTab)
    BmMainNavigateTabBar mainTab;

    private final int REQUEST_MINE = 4;

    private int REQUEST_LOGIN = -1;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initViewAndData() {
        ButterKnife.bind(this);
        mainTab.addTab(HomeFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_home_nor,
                        R.drawable.ic_tab_home_sel, "首页"));
        mainTab.addTab(MessageFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_msg_nor,
                        R.drawable.ic_tab_msg_sel, "消息"));
        mainTab.addTab(FindFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_find_nor,
                        R.drawable.ic_tab_find_sel, "发现"));
        mainTab.addTab(ShopCartFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_shopcart_nor,
                        R.drawable.ic_tab_shopcart_sel, "购物车"));
        mainTab.addTab(MineFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_mine_nor,
                        R.drawable.ic_tab_mine_sel, "我的"));
        mainTab.setTabSelectListener(new BmMainNavigateTabBar.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(BmMainNavigateTabBar.ViewHolder holder) {
                if (holder.tabIndex == 4) {
                    if (!UserHelper.getInstance().isLogin(MainActivity.this)) {
                        REQUEST_LOGIN = REQUEST_MINE;
                        jumpTo(AccountActivity.class);
                        return false;
                    }
                }
                return true;
            }
        });
    }


    @Override
    protected boolean isRegisterEventBus() {
        return true;
    }

    @Override
    protected void onEventComming(EventData eventData) {
        super.onEventComming(eventData);
        if (eventData.CODE == EventCode.EVENT_LOGIN_SUCCESS) {
            switch (REQUEST_LOGIN) {
                case REQUEST_MINE:
                    mainTab.setCurrentSelectedTab(4);
                    break;
                default:
                    break;
            }
        }
    }
}
