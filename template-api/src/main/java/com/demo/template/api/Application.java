package com.demo.template.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(value = "com.demo.template.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
