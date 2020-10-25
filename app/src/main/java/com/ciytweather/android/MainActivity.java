package com.ciytweather.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout refreshLayout;
    private TextView tv_cityName;
    String cityName  = "深圳";
    private TextView qiehuan;
    private TextView sheshidu;
    private TextView fengxiang;
    private TextView tv_zhuanugtai;
    private ImageView tv_zhuagkuang;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, t11v, tv22, tv33, tv44, tv55, tv66;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}