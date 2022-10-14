package com.skotmak.lesson_13.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class MyDbManager {
    private Context context; // для передачи контекста на MyDbHelper
    private MyDbHelper myDbHelper; // запуск класса myDbHelper
    private SQLiteDatabase db; // бд которую будем открывать



    public MyDbManager(Context context){
        this.context = context;
        myDbHelper = new MyDbHelper(context); // инициализация myDbHelper
    }


    public void openDb(){ // открытие бд
        db = myDbHelper.getWritableDatabase();
    }

    public void  InsertToDb(String title, String disc){ // функция для записи
        ContentValues cv = new ContentValues();
        cv.put(MyConstans.TITLE, title);
        cv.put(MyConstans.DISC, disc);
        db.insert(MyConstans.TABLE_NAME, null, cv);
    }

    public List<String> getFromDb(){  // функция считывания. будет возвращать список с уже заполнеными значенями title
        List<String> tempList = new ArrayList<>(); // list нужен для показа в textview
        Cursor cursor = db.query(MyConstans.TABLE_NAME, null, null,null,null,null,null);// курсор потребляет много ресурсов поэтому мы его закроем
        while (cursor.moveToNext()){ // курсор будет двигаться по каждому элементу до конца бд
            String title = cursor.getString(cursor.getColumnIndex(MyConstans.TITLE)); // настраиваем курсор
            tempList.add(title); //добавляем в список
        }
        cursor.close();
        return tempList;
    }


    public void closeDb(){ // функция закрытия бд
        myDbHelper.close();
    }


}
