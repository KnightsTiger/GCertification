package com.example.knight.gcertification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class UIElements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uielements);
    }

    public void switchInAction(View view) {
        Switch aSwitch = findViewById(R.id.switch1);
        if(aSwitch.isChecked()) {
            Toast.makeText(this, "Action On", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Switch Off", Toast.LENGTH_SHORT).show();
        }
    }

    public void toggleInAction(View view) {
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        if(toggleButton.isChecked())
            Toast.makeText(this,"Toggle On",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Toggle Off",Toast.LENGTH_SHORT).show();
    }

    public void checkBoxInAction(View view) {
        boolean chkbox =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox:
                if(chkbox)
                    Toast.makeText(this,"Apple",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if(chkbox)
                Toast.makeText(this,"Oranges",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                if(chkbox)
                Toast.makeText(this,"PineApple",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
