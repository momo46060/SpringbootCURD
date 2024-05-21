package com.example.demo.model;



public class ShopInfo {

    private long id = 0;
    private String name;
    private String address;
    private String phone;

    public ShopInfo() {
    }

    public ShopInfo( Long id,String name, String address, String phone) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




}
