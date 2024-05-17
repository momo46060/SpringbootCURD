package com.example.demo.service;

import com.example.demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String CreatCloudVendor(CloudVendor cloudVendor);
    public String UpdateCloudVendor(CloudVendor cloudVendor);
    public String DeleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();

}
