package com.beitone.medical.doctor.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.beitone.medical.doctor.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;
import java.util.List;

public class RevenuePieChartView extends LinearLayout {

    private PieChart mPieChart;

    public RevenuePieChartView(Context context) {
        this(context,null);
    }

    public RevenuePieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RevenuePieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @SuppressLint("NewApi")
    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_revenue_chart_pie ,
                this);
        mPieChart = contentView.findViewById(R.id.pieChartView);

        mPieChart.setDrawHoleEnabled(true);              //是否显示PieChart内部圆环(true:下面属性才有意义)
        mPieChart.setHoleRadius(68f);                    //设置PieChart内部圆的半径(这里设置28.0f)
        mPieChart.setTransparentCircleRadius(0f);

        mPieChart.setDefaultFocusHighlightEnabled(false);
        mPieChart.getDescription().setEnabled(false);
        mPieChart.setDescription(null);
        mPieChart.setTouchEnabled(false);
        // enable scaling and dragging
        mPieChart.setUsePercentValues(true);
        Legend legend = mPieChart.getLegend();
        legend.setEnabled(false);
        legend.setForm(Legend.LegendForm.NONE);
    }


    public void setData(){
        ArrayList<PieEntry> entries = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            entries.add(new PieEntry((float) ((Math.random() * 70) + 30), ""));
        }
        List<Integer> colors = new ArrayList<>();
        colors.add(Color.parseColor("#61ADFE"));
        colors.add(Color.parseColor("#FCB12A"));
        colors.add(Color.parseColor("#EF738C"));
        colors.add(Color.parseColor("#5DD186"));
        colors.add(Color.parseColor("#63DCE1"));

        PieDataSet d = new PieDataSet(entries, "");
        // space between slices
        d.setColors(colors);
        PieData pieData= new PieData(d);
        pieData.setValueFormatter(new PercentFormatter(){

            @Override
            public String getPieLabel(float value, PieEntry pieEntry) {
                return "";
            }
        });
        mPieChart.setData(pieData);
    }

}
