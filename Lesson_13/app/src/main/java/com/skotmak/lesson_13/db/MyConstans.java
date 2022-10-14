package com.skotmak.lesson_13.db;

public class MyConstans {
    public static final String TABLE_NAME = "my_table";// название таблицы
    public static final String _ID = "_ID";// название колонны где будет находится идентификатор
    public static final String TITLE = "title";// колонна где будет храниться заголовок
    public static final String DISC = "disc";// колонна где будет храниться описание
    public static final String DB_NAME = "my_db.db";// название базы данных, не забывай про расширение .db
    public static final int DB_VERSION = 1;// версия базы данных
    public static final String TABLE_STRUCTURE = "CREATE TABLE IF NOT EXISTS " +
            TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," + TITLE + " TEXT," +
            DISC + " TEXT)"; // структура таблицы
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME; // удаление таблицы
}
