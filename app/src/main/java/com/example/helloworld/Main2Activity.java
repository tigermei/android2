package com.example.helloworld;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.utils.Utils;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    private void changeTVdp(){
        int dip_10 = Utils.dip2px(this, 10L);
        TextView tv_padding = findViewById(R.id.tv_padding);
        tv_padding.setPadding(dip_10, dip_10, dip_10, dip_10);
    }
}