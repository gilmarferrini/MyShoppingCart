package com.example.myshoppingcart.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.myshoppingcart.datamodel.ItemDataModel;
import com.example.myshoppingcart.model.Item;

import java.util.ArrayList;
import java.util.List;

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

    public boolean insert(String tableName, ContentValues data) {
        boolean result = false;

        db = getWritableDatabase();

        try {
            result = db.insert(tableName, null, data) > 0;
        } catch (Exception e) {
            Log.e("TAG", "AppDataBase insert: " + e.getMessage());
        }

        return result;
    }

    public List<Item> index(String tableName) {
        List<Item> list = new ArrayList<>();

        db = getWritableDatabase();
        String query = "SELECT * FROM " + tableName;

        Cursor cursor;
        cursor = db.rawQuery(query, null);

        try {
            if(cursor.moveToFirst()) {
                do {
                    Item item = new Item();
                    item.setId(cursor.getInt(cursor.getColumnIndex(ItemDataModel.ID)));
                    item.setName(cursor.getString(cursor.getColumnIndexOrThrow(ItemDataModel.NAME)));

                    list.add(item);

                } while(cursor.moveToNext());
            }

        } catch (Exception e) {
            Log.e("TAG", "AppDataBase insert: " + e.getMessage());
        }

        return list;
    }

}
