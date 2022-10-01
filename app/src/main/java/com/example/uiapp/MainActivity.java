package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {
        Button colorButton = findViewById(R.id.colorButton);
        colorButton.setBackgroundColor(Color.YELLOW);
    }

    public void changeColor4(View view) {
        Button colorButton4 = findViewById(R.id.colorButton4);
        colorButton4.setBackgroundColor(Color.YELLOW);
    }

    public void changeColor2(View view) {
        Button colorButton2 = findViewById(R.id.colorButton2);
        colorButton2.setBackgroundColor(Color.YELLOW);
    }

    public void changeColor3(View view) {
        Button colorButton3 = findViewById(R.id.colorButton3);
        colorButton3.setBackgroundColor(Color.YELLOW);
    }
}