package com.skotmak.lesson_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private TextView tvtext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        tvtext = findViewById(R.id.tvtext1);
        Intent i = getIntent();
        if (i != null)
        {
            Log.d("Mylog", "-------------------" + i.getStringExtra("key5"));
            Log.d("Mylog", "Result A3 string: " + i.getStringExtra("key1"));
            Log.d("Mylog", "Result A3 string: " + i.getStringExtra("key4"));
            Log.d("Mylog", "Result A3 int: " + i.getIntExtra("key2", 0));
            Log.d("Mylog", "Result A3 boolean: " + i.getBooleanExtra("key3", false));
            //i.putExtra("sec_name", "kek");
            tvtext.setText(i.getStringExtra("key4"));
            //setResult(RESULT_OK,i);
            //finish();
        }
    }

    public void onclick3(View view) {
        Intent i = new Intent(Activity3.this, MainActivity.class);
        i.putExtra("ac2", "I bought one apple, but there was ten. I love apple");
        setResult(RESULT_OK, i);
        finish();


    }




    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        finish();
    }
}