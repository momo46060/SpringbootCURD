package com.example.demo.repository;

import com.example.demo.model.ShopInfo;

import java.util.List;

public interface ShopRepository {

    Long Insert(ShopInfo info);

    List<ShopInfo> findAll();
}
