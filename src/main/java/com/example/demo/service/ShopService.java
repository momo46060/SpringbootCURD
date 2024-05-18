package com.example.demo.service;

import com.example.demo.model.ShopInfo;
import com.example.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShopService {

    @Autowired
    private ShopRepository repository;


    public Map<String,Object> findAll() {
        Map<String,Object> map = new HashMap<>();
        if (repository.findAll() == null || repository.findAll().isEmpty()){
            map.put("status", 5);
        }else {
            map.put("status", HttpStatus.OK);
            map.put("shops",repository.findAll());
            repository.findAll();
        }

        return map;
    }
    public Map<String,Object> findByName(String name) {
        Map<String,Object> map = new HashMap<>();
        if (repository.findAll() == null || repository.findAll().isEmpty()){
            map.put("status", 5);
        }else {
            map.put("status", HttpStatus.OK);
            map.put("shops",repository.findAll());
            repository.findAll();
        }

        return map;
    }
    public  Map<String,Object> insert(ShopInfo info) {
        Map<String,Object> map = new HashMap<>();
        try {
            repository.Insert(info);
            map.put("status", HttpStatus.OK);
            map.put("id",repository.findByName(info.getName()).getId());
        }catch (Exception e){
            e.printStackTrace();
            map.put("status", 5);
            map.put("message", e.getMessage());
        }
        return map;

    }

}
