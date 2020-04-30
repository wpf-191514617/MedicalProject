package net.shopnc.b2b2c.android.xrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.beitone.medical.storeui.R;

import net.shopnc.b2b2c.android.xrefresh.callback.IFooterCallBack;
import net.shopnc.b2b2c.android.xrefresh.progressindicator.AVLoadingIndicatorView;


public class XRefreshViewFooter extends LinearLayout implements IFooterCallBack {
    private Context mContext;

    private View mContentView;
    private LinearLayout llLoading;
    private SimpleViewSwithcer mProgressBar;
    private TextView mHintView;
    private TextView mClickView;

    public XRefreshViewFooter(Context context) {
        super(context);
        initView(context);
    }

    public XRefreshViewFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    @Override
    public void callWhenNotAutoLoadMore(final XRefreshView.XRefreshViewListener listener) {
        mClickView.setText(R.string.xrefreshview_footer_hint_click);
        mClickView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onLoadMore(false);
                    onStateRefreshing();
                }
            }
        });
    }

    @Override
    public void onStateReady() {
        mHintView.setVisibility(View.GONE);
        llLoading.setVisibility(View.GONE);
        mClickView.setVisibility(View.GONE);
        setVisibility(GONE);
    }

    @Override
    public void onStateRefreshing() {
        mHintView.setVisibility(View.GONE);
        llLoading.setVisibility(View.VISIBLE);
        mClickView.setVisibility(View.GONE);
        setVisibility(VISIBLE);
    }

    @Override
    public void onStateFinish() {
        mHintView.setVisibility(View.GONE);
        llLoading.setVisibility(View.GONE);
        mClickView.setVisibility(View.GONE);
        setVisibility(GONE);

    }

    @Override
    public void onStateComplete() {
        mHintView.setText(R.string.xrefreshview_footer_hint_complete);
        mHintView.setVisibility(View.VISIBLE);
        llLoading.setVisibility(View.GONE);
        setVisibility(GONE);
    }

    public void hide() {
//        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) mContentView
//                .getLayoutParams();
//        lp.height = 0;
//        mContentView.setLayoutParams(lp);
        mContentView.setVisibility(GONE);
    }

    public void show() {
//        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) mContentView
//                .getLayoutParams();
//        lp.height = LayoutParams.WRAP_CONTENT;
//        mContentView.setLayoutParams(lp);
        mContentView.setVisibility(VISIBLE);
    }

    private void initView(Context context) {
        setOrientation(HORIZONTAL);
        mContext = context;
        RelativeLayout moreView = (RelativeLayout) LayoutInflater
                .from(mContext).inflate(R.layout.xrefreshview_footer, null);
        addView(moreView);

        mContentView = moreView.findViewById(R.id.xrefreshview_footer_content);
        mProgressBar = (SimpleViewSwithcer)moreView
                .findViewById(R.id.xrefreshview_footer_progressbar);
        llLoading = (LinearLayout)moreView.findViewById(R.id.xrefreshview_loading);
        mHintView = (TextView) moreView
                .findViewById(R.id.xrefreshview_footer_hint_textview);
        mClickView = (TextView) moreView
                .findViewById(R.id.xrefreshview_footer_click_textview);
        setVisibility(GONE);

        AVLoadingIndicatorView progressView = new AVLoadingIndicatorView(this.getContext());
        progressView.setIndicatorColor(0xffB5B5B5);
        progressView.setIndicatorId(ProgressStyle.BallSpinFadeLoader);
        mProgressBar.setView(progressView);
    }

    @Override
    public int getFooterHeight() {
        return getMeasuredHeight();
    }
}
