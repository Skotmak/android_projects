package com.skotmak.lesson_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private SharedPreferences pref1;
    private TextView tvresult;
    private TextView tvresult1;
    private  int counter = 0;
    private  int counter1 = 0;
    private final static String KEY = "key";
    private final static String KEY1 = "key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvresult = findViewById(R.id.tvresult);
        tvresult1 = findViewById(R.id.tvresult1);

        pref = getSharedPreferences("table", MODE_PRIVATE);
        pref1 = getSharedPreferences("table1", MODE_PRIVATE);
        counter = pref.getInt(KEY, 0);
        counter1 = pref1.getInt(KEY1, 0);
        tvresult.setText(String.valueOf(counter));
        tvresult1.setText(String.valueOf(counter1));


    }


    private void safedata(int datatosave){
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(KEY, datatosave);
        editor.apply();
    }
    private void safedata1(int datatosave){
        SharedPreferences.Editor editor1 = pref1.edit();
        editor1.putInt(KEY1, datatosave);
        editor1.apply();
    }


    public void onclickadd(View view) {
        counter++;
        counter1++;
        tvresult.setText(String.valueOf(counter));
        tvresult1.setText(String.valueOf(counter1));
        safedata(counter);
        safedata1(counter1);
    }
    public void onclickleft(View view) {
        counter++;
        tvresult.setText(String.valueOf(counter));
        safedata(counter);

    }

    public void onclickright(View view) {
        counter1++;
        tvresult1.setText(String.valueOf(counter1));
        safedata1(counter1);
    }




    private void deletekey(){
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(KEY);
        editor.apply();
    }
    private void deletekey1(){
        SharedPreferences.Editor editor1 = pref1.edit();
        editor1.remove(KEY1);
        editor1.apply();
    }

    private void deleteall(){
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences.Editor editor1 = pref1.edit();
        editor.clear();
        editor.apply();
        editor1.clear();
        editor1.apply();
    }


    public void onclickdeleteleft(View view) {
        deletekey();
    }

    public void onclickdeleteright(View view) {
        deletekey1();
    }

    public void onclickdeleteall(View view) {
        deleteall();
    }

}