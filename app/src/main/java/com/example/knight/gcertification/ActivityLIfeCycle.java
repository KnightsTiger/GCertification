package com.example.knight.gcertification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLIfeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.i("oneonCreate","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("twp","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("three","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("four","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("five","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("six","onDestroy");
    }
}
