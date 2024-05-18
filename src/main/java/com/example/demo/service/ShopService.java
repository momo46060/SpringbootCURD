package com.example.demo.service;

import com.example.demo.model.ShopInfo;
import com.example.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository repository;


    public List<ShopInfo> findAll() {

        return repository.findAll();
    }

    public Long insert(ShopInfo info) {
        return repository.Insert(info);
    }

}
