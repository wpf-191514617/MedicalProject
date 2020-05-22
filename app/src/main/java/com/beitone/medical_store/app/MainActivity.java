package com.beitone.medical_store.app;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.beitone.medical_store.app.helper.UserHelper;
import com.beitone.medical_store.app.ui.account.AccountActivity;
import com.beitone.medical_store.app.ui.home.FindFragment;
import com.beitone.medical_store.app.ui.home.HomeFragment;
import com.beitone.medical_store.app.ui.home.MessageFragment;
import com.beitone.medical_store.app.ui.home.MineFragment;
import com.beitone.medical_store.app.ui.home.ShopCartFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.util.Trace;
import cn.betatown.mobile.beitonelibrary.widget.BmMainNavigateTabBar;

public class MainActivity extends BaseActivity {

    @BindView(R.id.layoutHomeContent)
    FrameLayout layoutHomeContent;
    @BindView(R.id.mainTab)
    BmMainNavigateTabBar mainTab;

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
                    if (!UserHelper.getInstance().isLogin(MainActivity.this)){
                        jumpTo(AccountActivity.class);
                        return false;
                    }
                }
                return true;
            }
        });
        init();
    }

    private void init() {
        String content = "动作名称：徒手操 动作内容：1、头部运动；2、扩胸运动；3、体转运动；4、扶背运动；5、正压腿；6、侧压腿；7、手腕脚踝环绕";
        String[] array = content.split("动作内容：");
        if (array != null){
            if (array[0].contains("动作名称：")){
                array[0].replace("动作名称：" , "");
            }

            if (array.length > 1){
                Trace.d("arrayTag" , "0 - " + array[0]);
                Trace.d("arrayTag" , "1 - " + array[1]);
            }
        }
    }

}
