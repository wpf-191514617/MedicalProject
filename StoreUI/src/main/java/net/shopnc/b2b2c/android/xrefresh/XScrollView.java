package net.shopnc.b2b2c.android.xrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class XScrollView extends ScrollView {

	private OnScrollBottomListener _listener;
	private int _calCount;
	private XScrollViewListener xScrollViewListener;

	//滚动到底部时，clampedY变为true，其余情况为false，通过回调将状态传出去即可。
	@Override
	protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
		super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
		if (scrollY != 0 && null != mOnScrollToBottomListener) {
			mOnScrollToBottomListener.onScrollBottomListener(clampedY);
		}
	}

	public interface OnScrollToBottomListener {
		public void onScrollBottomListener(boolean isBottom);
	}


	private OnScrollToBottomListener mOnScrollToBottomListener;

	public void setOnScrollToBottomLintener(OnScrollToBottomListener listener) {
		mOnScrollToBottomListener = listener;
	}

	public interface OnScrollBottomListener {
		void srollToBottom();
	}

	public void registerOnBottomListener(OnScrollBottomListener l) {
		_listener = l;
	}

	public void unRegisterOnBottomListener() {
		_listener = null;
	}

	public XScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		View view = this.getChildAt(0);
		if (this.getHeight() + this.getScrollY() == view.getHeight()) {
			_calCount++;
			if (_calCount == 1) {
				if (_listener != null) {
					_listener.srollToBottom();
				}
			}
		} else {
			_calCount = 0;
		}
		if (null!=xScrollViewListener){
			xScrollViewListener.onScrollChanged(l,t,oldl,oldt);
		}

	}

	public interface XScrollViewListener {
		void onScrollChanged(int x, int y, int oldx, int oldy);
	}

	public void setXScrollViewListener(XScrollViewListener xlistener){
		this.xScrollViewListener=xlistener;
	}
}
