package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication


@ComponentScan(basePackages = {"com.example.persistence.mapper"})


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


