package com.skotmak.lesson_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onclick1(View View){
        Fragment1 f1 = new Fragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, f1);
        ft.commit();
    }
    public void onclick2(View View){
        Fragment2 f2 = new Fragment2();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, f2);
        ft.commit();
    }
    public void onclick3(View View){
        Fragment3 f3 = new Fragment3();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.cont, f3);
        ft.commit();
    }






}