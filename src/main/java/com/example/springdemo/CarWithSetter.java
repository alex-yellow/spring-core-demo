package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithSetter {
    private Engine engine;
    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Driving with setter-injected engine");
    }
}
