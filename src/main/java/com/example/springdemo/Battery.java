package com.example.springdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Battery {
    @PostConstruct
    public void init(){
        System.out.println("Battery initialized");
    }

    @PreDestroy
    public void shutdown(){
        System.out.println("Battery shutting down");
    }
}
