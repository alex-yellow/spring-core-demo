package com.example.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class singletonBean {
    public singletonBean(){
        System.out.println("Singleton bean " + this);
    }
}
