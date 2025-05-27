package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}
