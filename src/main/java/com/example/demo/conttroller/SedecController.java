package com.example.demo.conttroller;

import com.example.demo.model.ShopInfo;
import com.example.demo.model.UserInfo;
import com.example.demo.service.SedecService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sedec")
public class SedecController {

    @Autowired
    SedecService sedecService;

    @GetMapping("/getusers/{role}")
    public Map<String,Object> getUsersbyrole(@PathVariable int role){
       return  sedecService.getUsersByRole(role);
    }

    @PostMapping("/updateuser")
    public List<Map<String,Object>> addShop(@RequestBody List<UserInfo> userInfo) {
        return sedecService.updateUser(userInfo);
    }
}
