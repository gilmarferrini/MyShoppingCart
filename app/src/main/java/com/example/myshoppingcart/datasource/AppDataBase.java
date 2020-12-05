package com.example.myshoppingcart.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.myshoppingcart.datamodel.ItemDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "myshoppingcart.sqlite";
    public static final int DB_VERSION = 1;

    private SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ItemDataModel.createTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
