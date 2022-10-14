package com.skotmak.lesson_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = getIntent();
        if (i != null)
        {
            Log.d("Mylog", "Result string: " + i.getStringExtra("key1"));
            Log.d("Mylog", "Result int: " + i.getIntExtra("key2", 0));
            Log.d("Mylog", "Result boolean: " + i.getBooleanExtra("key3", false));
            i.putExtra("name", "lol");
            setResult(RESULT_OK,i);
            //finish();
        }

    }

    public void onclick2(View view) {
        Intent i = new Intent(Activity2.this, Activity3.class);
        startActivity(i);
        finish();

    }
}