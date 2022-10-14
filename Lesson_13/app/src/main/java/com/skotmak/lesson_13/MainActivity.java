package com.skotmak.lesson_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.skotmak.lesson_13.db.MyDbManager;

public class MainActivity extends AppCompatActivity {
    private MyDbManager myDbManager; // создадим объект myDbManager
    private EditText edTitle, edDisc;// отсюда мы берем данные для onClickSave
    private TextView tvTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDbManager= new MyDbManager(this);    //инициализируем myDbManager
        edTitle = findViewById(R.id.edTitle);
        edDisc = findViewById(R.id.edDisc);
        tvTest = findViewById(R.id.tvTest);
    }

    @Override
    protected void onResume() { //когда создастся наш MainActivity здесь мы запустим открытие бд
        super.onResume();
        myDbManager.openDb();
        for(String title : myDbManager.getFromDb()){
            tvTest.append(title);
            tvTest.append("\n");
        }
    }

    public void onClickSave(View view) {
        tvTest.setText("");
        myDbManager.InsertToDb(edTitle.getText().toString(), edDisc.getText().toString()); // перемещаем текст в бд
        for(String title : myDbManager.getFromDb()){ // спомощью цикла достаём всё что есть в бд и показываем в textview
            tvTest.append(title);
            tvTest.append("\n");
        }
    }

    @Override
    protected void onDestroy() {// закрываем бд
        super.onDestroy();
        myDbManager.closeDb();
    }
}