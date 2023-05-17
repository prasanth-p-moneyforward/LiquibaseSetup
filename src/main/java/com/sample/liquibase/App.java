package com.sample.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        SpringApplication.run(App.class, args);
    }
}
