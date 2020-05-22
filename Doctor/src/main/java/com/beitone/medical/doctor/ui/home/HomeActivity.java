package com.beitone.medical.doctor.ui.home;

import android.widget.FrameLayout;

import com.beitone.medical.doctor.R;
import com.beitone.medical.doctor.ui.home.fragment.ApplicationFragment;
import com.beitone.medical.doctor.ui.home.fragment.ContactListFragment;
import com.beitone.medical.doctor.ui.home.fragment.ConversationFragment;
import com.beitone.medical.doctor.ui.home.fragment.RemindFragment;
import com.beitone.medical.doctor.ui.home.fragment.UserFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.betatown.mobile.beitonelibrary.base.BaseActivity;
import cn.betatown.mobile.beitonelibrary.widget.BmMainNavigateTabBar;

public class HomeActivity extends BaseActivity {

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
        mainTab.addTab(ConversationFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_conversation_nor,
                        R.drawable.ic_tab_conversation_sel, "会话"));
        mainTab.addTab(RemindFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_msg_nor,
                        R.drawable.ic_tab_msg_sel, "提醒"));
        mainTab.addTab(ContactListFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_contact_nor,
                        R.drawable.ic_tab_contact_sel, "通讯录"));
        mainTab.addTab(ApplicationFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_application_nor,
                        R.drawable.ic_tab_application_sel, "应用"));
        mainTab.addTab(UserFragment.class,
                new BmMainNavigateTabBar.TabParam(R.drawable.ic_tab_mine_nor,
                        R.drawable.ic_tab_mine_sel, "我的"));
    }

}
