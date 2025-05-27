package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithField {
    @Autowired
    private Engine engine;

    public void drive(){
        engine.start();
        System.out.println("Driving with field-injected engine");
    }
}
