package com.example.testapp.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("myCache")
    public Map<String, String> getData() {
        System.out.println("Creating new map and storing in cache...");

        Map<String, String> data = new HashMap<>();
        data.put("KEY1", "VALUE1");
        data.put("KEY2", "VALUE2");
        data.put("generatedAt", LocalDateTime.now().toString());

        return data;
    }

    @CacheEvict(value = "myCache", allEntries = true)
    public String clearCache() {
        System.out.println("Cache cleared...");
        return "Cache cleared successfully";
    }
}