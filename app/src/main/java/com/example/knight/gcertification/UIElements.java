package com.example.knight.gcertification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class UIElements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uielements);
    }

    public void toggleButtonInAction(View view) {
        Switch aSwitch = findViewById(R.id.switch1);
        if(aSwitch.isChecked()) {
            Toast.makeText(this, "Action On", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Switch Off", Toast.LENGTH_SHORT).show();
        }
    }
}
