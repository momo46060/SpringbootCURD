package com.example.demo.repository;

import com.example.demo.model.ShopInfo;

import java.util.List;

public interface ShopRepository {

    void Insert(ShopInfo info);

    List<ShopInfo> findAll();
    ShopInfo findByName(String Name);
}
