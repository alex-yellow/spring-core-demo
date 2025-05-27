package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        var car1 = context.getBean(CarWithConstructor.class);
        car1.drive();
        var car2 = context.getBean(CarWithSetter.class);
        car2.drive();
        var car3 = context.getBean(CarWithField.class);
        car3.drive();
    }

}
