package com.example.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 当前的页面布局采用的是res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
        TextView tv_helloworld = findViewById(R.id.tv_helloworld);
        tv_helloworld.setText("今天天气不错，挺风和日丽的！！");
        tv_helloworld.setTextColor(Color.BLUE);
        tv_helloworld.setTextSize(40);

//
//        // 获取名叫tv_hello的TextView控件
//        TextView tv_hello = findViewById(R.id.tv_hello);
//        // 设置TextView控件的文字内容
//        tv_hello.setText("今天天气真热啊，火辣辣的");
//        // 设置TextView控件的文字颜色
//        tv_hello.setTextColor(Color.RED);
//        // 设置TextView控件的文字大小
//        tv_hello.setTextSize(30);
    }
}
