package com.beitone.medical_store.app.ui.hospital.reservation.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import com.beitone.medical_store.app.R;
import com.beitone.medical_store.app.ui.doctor.item.InterviewItem;
import com.donkingliang.imageselector.view.MyViewPager;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class DoctorInterView extends LinearLayout {

    private TabLayout tabLayout;
    private MyViewPager viewPager;

    private List<View> viewContainter = new ArrayList<View>();

    public DoctorInterView(Context context) {
        this(context, null);
    }

    public DoctorInterView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DoctorInterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_doc_interview,
                this);
        tabLayout = contentView.findViewById(R.id.tabDocInterview);
        viewPager = contentView.findViewById(R.id.vpDocInterView);
        InterviewItem interviewItem = new InterviewItem(context);
        interviewItem.hideDivierView();
        viewContainter.add(interviewItem);
        viewContainter.add(new ShiftView(context));
        viewPager.setAdapter(new MyPagerAdapter());
        tabLayout.setupWithViewPager(viewPager);
    }

    public void addOnTabSelectedListener(TabLayout.OnTabSelectedListener tabSelectedListener){
        tabLayout.addOnTabSelectedListener(tabSelectedListener);
    }



    class MyPagerAdapter extends PagerAdapter {
        //1. 返回可以滑动的View的个数
        @Override
        public int getCount() {
            return viewContainter.size();
        }

        //2. 滑动切换时销毁当前View
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(viewContainter.get(position));
        }

        //3. 将当前View添加到父容器中，并且返回当前View
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewContainter.get(position));
            return viewContainter.get(position);
        }

        //4. 确认"第三步"instantiateItem返回的Object与页面View是否是同一个
        @Override
        public boolean isViewFromObject(View view, Object object) {
            //5. 官方推荐直接 `view == object`
            return view == object;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return position == 0 ? "远程问诊" : "预约挂号";
        }
    }

}
