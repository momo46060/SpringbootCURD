package com.example.demo.conttroller;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor/")
public class VendorCotroller {

    CloudVendorService cloudVendorService;

    public VendorCotroller(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("get/{id}")
    public CloudVendor hi(@PathVariable("id") String id) {
        return cloudVendorService.getCloudVendor(id);
    }

    @GetMapping("getall")
    public List<CloudVendor> hi() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping("post")
    public String post(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.CreatCloudVendor(cloudVendor);
    }

    @DeleteMapping("delete/{id}")
    public String post(@PathVariable("id") String id) {
        return cloudVendorService.DeleteCloudVendor(id);
    }
}
