package com.example.demo.repository;

import com.example.demo.model.UserInfo;

import java.util.List;

public interface MobileRepository {

    public List<UserInfo> getAllUsers(int role);

    public void updateUserInfo(UserInfo userInfo);



}
