package com.example.demo.conttroller;

import com.example.demo.model.ShopInfo;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/getall")
    public Map<String,Object> shops() {
        return shopService.findAll();
    }


    @PostMapping("addshop")
    public Map<String,Object> addShop(@RequestBody ShopInfo shop) {
        return shopService.insert(shop);
    }

}
