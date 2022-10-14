package com.skotmak.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvtest;
    private TextView tvres;
    private EditText eText1;
    private EditText eText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find variable
        tvtest = findViewById(R.id.textView);
        tvres = findViewById(R.id.tvresult);
        eText1 = findViewById(R.id.editText);
        eText2 = findViewById(R.id.editText2);
        tvtest.setTextColor(Color.GREEN);
    }

    public void onclickcolor(View View){
    tvtest.setTextColor(getResources().getColor(R.color.color_red));
    }
    public void onclickyellow(View View){
        tvtest.setTextColor(getResources().getColor(R.color.color_yellow));
    }    public void onclickgreen(View View){
        tvtest.setTextColor(getResources().getColor(R.color.color_green));
    }

    public void onclickresult(View View){
        //this is a comment
        int num1 = Integer.parseInt(eText1.getText().toString());
        int num2 = Integer.parseInt(eText2.getText().toString());
        int result = num1 + num2;
        tvres.setText(String.valueOf(result));

    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}