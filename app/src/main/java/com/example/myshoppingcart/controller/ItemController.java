package com.example.myshoppingcart.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.myshoppingcart.datamodel.ItemDataModel;
import com.example.myshoppingcart.datasource.AppDataBase;
import com.example.myshoppingcart.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemController extends AppDataBase implements ICrud<Item> {

    private ContentValues objData;

    public ItemController(Context context) {
        super(context);
    }

    @Override
    public boolean store(Item obj) {
        objData = new ContentValues();

        objData.put(ItemDataModel.NAME, obj.getName());

        return false;
    }

    @Override
    public boolean updateByID(Item obj, int id) {
        objData = new ContentValues();

        objData.put(ItemDataModel.ID, obj.getId());
        objData.put(ItemDataModel.NAME, obj.getName());

        return false;
    }

    @Override
    public boolean deleteByID(int id) {

        return false;
    }

    @Override
    public List<Item> index() {
        List<Item> itemsList = new ArrayList<>();

        return itemsList;
    }
}
