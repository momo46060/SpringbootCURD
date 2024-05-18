package com.example.demo.conttroller;

import com.example.demo.model.CloudVendor;
import com.example.demo.model.ResponseRaper;
import com.example.demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/cloudvendor/")
public class VendorCotroller {

    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("get/{id}")
    public ResponseEntity<Object> hi(@PathVariable("id") String id) {
        return ResponseRaper.responseBuldier(
                "The data was Caught",
                HttpStatus.OK, cloudVendorService.getCloudVendor(id));


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
