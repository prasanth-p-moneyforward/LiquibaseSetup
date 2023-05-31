package com.sample.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App {
    public static void main(String[] args) {
    	System.out.println("Application Startup!!");
        SpringApplication.run(App.class, args);
    }
}
