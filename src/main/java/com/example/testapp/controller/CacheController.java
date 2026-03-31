package com.example.testapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.service.CacheService;

@RestController
public class CacheController {

    @Autowired
    private CacheService cacheService;

    @GetMapping("/data")
    public Map<String, String> getData() {
        return cacheService.getData();
    }

    @PostMapping("/clear-cache")
    public String clearCache() {
        return cacheService.clearCache();
    }
}