package com.example.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class prototypeBean {
    public prototypeBean(){
        System.out.println("Prototype bean " + this);
    }
}
