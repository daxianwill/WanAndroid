package com.wanandroid.wanandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println();


        initUI();
    }

    /**
     * 初始化 UI
     */
    private void initUI() {

    }
}
