package net.shopnc.b2b2c.android.custom;

import android.view.MotionEvent;
import android.widget.GridView;

/**
 * @copyright  Copyright (c) 2007-2018 ShopNC Inc. All rights reserved.
 * @license    http://www.shopnc.net
 * @link       http://www.shopnc.net
 *
 * 解决gridview嵌套scrollview显示不全
 *
 * @author lulei
 * Created 2018/12/13 9:24
 */
public class MyGridView extends GridView {

    public MyGridView(android.content.Context context,
                      android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 设置不滚动
     */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // TODO Auto-generated method stub
        return false;
    }

}