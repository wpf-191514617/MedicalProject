package cn.betatown.mobile.beitonelibrary.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.android.tu.loadingdialog.LoadingDialog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import cn.betatown.mobile.beitonelibrary.R;
import cn.betatown.mobile.beitonelibrary.bean.EventData;
import cn.betatown.mobile.beitonelibrary.viewcontroller.callback.BaseView;
import me.jessyan.autosize.internal.CustomAdapt;

public abstract class BaseActivity extends BaseAppcomtActivity implements BaseView , CustomAdapt {

    protected Toolbar mToolbar;

    protected TextView tvTitle;

    public final String TAG = getClass().getSimpleName();

    private LoadingDialog mLoadingDailog;

    protected void showLoadingDialog() {
        if (mLoadingDailog == null) {
            LoadingDialog.Builder loadingBuilder = new LoadingDialog.Builder(this)
                    .setShowMessage(false)
                    .setCancelable(false);
            mLoadingDailog = loadingBuilder.create();
        }
        mLoadingDailog.show();
    }

    protected void onDismissLoading() {
        if (mLoadingDailog != null && mLoadingDailog.isShowing()) {
            mLoadingDailog.dismiss();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*BMStatusBarUtil.transparencyBar(this); //设置状态栏全透明
        BMStatusBarUtil.StatusBarLightMode(this); //设置白底黑字*/
        if (isRegisterEventBus()) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void setContentView(int layoutResId) {
        super.setContentView(layoutResId);
        mToolbar = findViewById(R.id.common_toolbar);
        if (null != mToolbar) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
            mToolbar.setNavigationIcon(R.drawable.ic_back);
            tvTitle = (TextView) findViewById(R.id.tvTitle);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        if (tvTitle != null && title != null && !TextUtils.isEmpty(title.toString())) {
            tvTitle.setText(title);
        }
    }

    @Override
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        if (tvTitle != null && titleId != 0) {
            tvTitle.setText(titleId);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isRegisterEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }


    @Override
    public void showLoading() {
        //switchView(getString(R.string.loading), R.drawable.bg_empty, v -> onClickReload());
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void showNetError() {

    }

    @Override
    public void showNormal() {
        // switchView(getString(R.string.empty), R.drawable.bg_empty, v -> onClickReload());
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
    public boolean isBaseOnWidth() {
        return false;
    }

    @Override
    public float getSizeInDp() {
        return 668;
    }

    protected void onClickReload() {

    }


    public void setText(TextView tv, String value) {
        if (TextUtils.isEmpty(value)) {
            value = "";
        }
        tv.setText(value);
    }

}
