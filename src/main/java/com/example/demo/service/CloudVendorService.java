package com.example.demo.service;

import com.example.demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    String CreatCloudVendor(CloudVendor cloudVendor);
    String DeleteCloudVendor(String cloudVendorId);
    CloudVendor getCloudVendor(String cloudVendorId);
    List<CloudVendor> getAllCloudVendors();

}
