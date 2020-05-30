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
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;


public class RevenueChartLineView extends LinearLayout {

    private LineChart mLineChart;

    public RevenueChartLineView(Context context) {
        this(context , null);
    }

    public RevenueChartLineView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public RevenueChartLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    @SuppressLint("NewApi")
    private void initView(Context context) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.layout_revenue_chart_line ,
                this);
        contentView.findViewById(R.id.tvChangeMonth).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mLineChart = contentView.findViewById(R.id.lineChart);
        mLineChart.setDefaultFocusHighlightEnabled(false);
        mLineChart.getDescription().setEnabled(false);
        mLineChart.setDescription(null);
        mLineChart.setTouchEnabled(false);
        // enable scaling and dragging
        mLineChart.setDragEnabled(false);
        mLineChart.setScaleEnabled(false);
        mLineChart.setDrawGridBackground(false);
        mLineChart.setPinchZoom(true);

        Legend legend = mLineChart.getLegend();
        legend.setForm(Legend.LegendForm.NONE);

        XAxis xAxis = mLineChart.getXAxis();
        xAxis.setAvoidFirstLastClipping(true);
        xAxis.setLabelCount(5,true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);


        YAxis leftAxis = mLineChart.getAxisLeft();
        leftAxis.setLabelCount(4, false);
        leftAxis.setAxisMinimum(0f);


        mLineChart.getAxisRight().setEnabled(false);
    }


    public void setData(){
        ArrayList<Entry> values1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            values1.add(new Entry(i, (int) (Math.random() * 65) + 40));
        }
        LineDataSet lineDataSet = new LineDataSet(values1 , "");
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setLineWidth(0.8f);
        lineDataSet.setCircleRadius(2.5f);
        lineDataSet.setHighLightColor(Color.rgb(100, 155, 245));
        lineDataSet.setDrawValues(false);
        mLineChart.setData(new LineData(lineDataSet));
        mLineChart.animateX(750);
    }

}
