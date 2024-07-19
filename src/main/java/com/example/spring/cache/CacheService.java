package com.example.spring.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("cache1")
    String foo() {
        System.out.println("string");
        return "string";
    }
}
