package com.skotmak.lesson_10;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int NAME = 2;
    public static final int SEC_NAME = 1;
    public static final int AC2 = 0;
    private TextView tvtv;
    private TextView tvtext3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtv = findViewById(R.id.tvtext2);
        tvtext3 = findViewById(R.id.tvtext3);
        tvtv.setText("Have a nice day!");
        Intent i = getIntent();
        /*if (i != null) {
            tvtv.setText(i.getStringExtra("key6"));
            tvtext3.setText(getWordCounter(i.getStringExtra("key6")));
        }*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            switch (requestCode) {
                case NAME:
                    Log.d("Mylog", "Result from Activity 2 : " + data.getStringExtra("name"));
                    break;
                case SEC_NAME:
                    Log.d("Mylog", "Result from Activity 3 : " + data.getStringExtra("sec_name"));
                    break;
                case  AC2:
                    Log.d("Mylog", "Result from Activity 3 : " + data.getStringExtra("ac2"));
                    tvtv.setText(data.getStringExtra("ac2"));
                    tvtext3.setText(getWordCounter(data.getStringExtra("ac2")));
                    break;

            }
        }

    }

    public void onclick1(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key1", "hello");
        i.putExtra("key2", 100);
        i.putExtra("key3", true);
        startActivityForResult(i, NAME);

    }

    public void onclick11(View view) {
        Intent i = new Intent(MainActivity.this, Activity3.class);
        i.putExtra("key5", "/////////////");
        i.putExtra("key1", "Where are you from?");
        i.putExtra("key4", "Hi Max! How are you?");
        i.putExtra("key2", 50);
        i.putExtra("key3", true);
        startActivityForResult(i, AC2);

    }


    private String getWordCounter(String tData) {

        int counter = 0;
        for(int i = 0; i < tData.length();i++)
        {
            if (tData.substring(i).startsWith("apple")) counter++;
        }
        return String.valueOf(counter);
    }

}
