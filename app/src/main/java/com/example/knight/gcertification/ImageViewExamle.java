package com.example.knight.gcertification;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageViewExamle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_examle);
    }

    public void showDialog(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.calenderaanddataandtime);
        dialog.show();
    }
}
