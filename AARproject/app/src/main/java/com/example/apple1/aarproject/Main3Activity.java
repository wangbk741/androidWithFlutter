package com.example.apple1.aarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = new Intent();
        intent.putExtra("result", "1");
        setResult(1000, intent);
        // 结束当前窗口的生命周期
        finish();
    }
}
