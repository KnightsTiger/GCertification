package com.example.knight.gcertification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goExplicitIntents(View view) {
        startActivity(new Intent(this,IntentXample.class));
    }

    public void goToUIIcons(View view) {
        startActivity(new Intent(this,UIElements.class));
    }

    public void goToImageView(View view) {
        startActivity(new Intent(this,ImageViewExamle.class));
    }

    public void goToMoreUI(View view) {
        startActivity(new Intent(this,MoreUIElements.class));
    }
}
