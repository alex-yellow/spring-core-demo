package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithConstructor {
    private final Engine engine;
    @Autowired
    public  CarWithConstructor(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Driving with constructor-injected engine");
    }
}
