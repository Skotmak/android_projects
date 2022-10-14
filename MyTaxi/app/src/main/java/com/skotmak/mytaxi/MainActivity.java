package com.skotmak.mytaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread() // создаём поток
        {
            @Override
            public void run() {
                super.run();
                {
                    try
                    {
                        sleep(5000); // показываем картинку 5 секунд
                    }
                    catch(Exception e) // исключение
                    {
                        e.printStackTrace();
                    }
                    finally {
                        Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class); // переходим на другой активити
                        startActivity(welcomeIntent); // запускаем активити
                    }
                }
            }
        };
        thread.start(); // запускаем поток


    }


    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}