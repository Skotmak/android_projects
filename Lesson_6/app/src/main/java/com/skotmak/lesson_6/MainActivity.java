package com.skotmak.lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private int[] numbers = {23,32,6,78,9};
    private String[] texts = {"hello", "how are you?"};
    private int[] numbers2 = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers2[0] = 123;
        Log.d("Mylog", "numbers in array: " + numbers[0] + " " + texts[1]);
        for(int i = 0; i < 10; i++) {
            Log.d("Mylog", "numbers in i: " + i);
        }
        while (){


        }
        do{

        }while{
            
        }

    }
}