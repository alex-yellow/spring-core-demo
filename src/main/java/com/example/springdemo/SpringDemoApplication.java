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
        System.out.println("Singleton");
        var s1 = context.getBean(singletonBean.class);
        var s2 = context.getBean(singletonBean.class);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("Prototype");
        var p1 = context.getBean(prototypeBean.class);
        var p2 = context.getBean(prototypeBean.class);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}
