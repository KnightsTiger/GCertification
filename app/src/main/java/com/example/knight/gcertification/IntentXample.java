package com.example.knight.gcertification;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class IntentXample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_xample);
    }

    public void webPage(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void callNow(View view) {
        Intent intent1 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:074586522"));
        startActivity(intent1);
    }

    public void getLocation(View view) {
        Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:51.7548,1.2544"));
        startActivity(intent2);
    }
}
