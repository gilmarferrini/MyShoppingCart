package com.example.myshoppingcart.datamodel;

public class ItemDataModel {

    public static final String TABLE = "items";

    public static final String ID = "id";
    public static final String NAME = "name";

    public static String queryForCreateTable = "";

    public static String createTable() {

        queryForCreateTable += "CREATE TABLE " + TABLE + " ( ";
        queryForCreateTable += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryForCreateTable += NAME + " TEXT ";
        queryForCreateTable += " )";

        return queryForCreateTable;
    }

}
