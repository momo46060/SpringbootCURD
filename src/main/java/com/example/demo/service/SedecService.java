package com.example.demo.service;

import com.example.demo.model.UserInfo;
import com.example.demo.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SedecService {

    @Autowired
    MobileRepository repository;

    public Map<String,Object> getUsersByRole(int role){
        Map<String,Object> map = new HashMap<>();
        try {
            map.put("status", HttpStatus.OK);
            map.put("data",repository.getAllUsers(role));
        }catch (Exception e){
            e.printStackTrace();
            map.put("status","error");
            map.put("message",e.getMessage());
        }
        return map;
    }
    public List<Map<String,Object>> updateUser(List<UserInfo> userInfo){
            List<Map<String,Object>> list = new ArrayList<>();
            for (UserInfo user : userInfo) {
                try {
                    Map<String,Object> map = new HashMap<>();
                    map.put("status", HttpStatus.OK);
                    repository.updateUserInfo(user);
                    map.put("username",user.getUserName());
                    list.add(map);
                }catch (Exception e){
                    Map<String,Object> map = new HashMap<>();
                    e.printStackTrace();
                    map.put("status","error");
                    map.put("message",e.getMessage());
                    list.add(map);
                }
            }

        return list;
    }


}
