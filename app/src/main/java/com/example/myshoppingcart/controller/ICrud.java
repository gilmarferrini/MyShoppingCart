package com.example.myshoppingcart.controller;

import java.util.List;

public interface ICrud<T> {

    public boolean store(T obj);

    public boolean updateByID(T obj, int id);

    public boolean deleteByID(int id);

    public List<T> index();

}
