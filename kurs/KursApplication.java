package com.nsahin.kurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KursApplication {

    public static void main(String[] args) {
        System.out.println("Application started.");
        SpringApplication.run(KursApplication.class, args);
        
        System.out.println("Application closed.");
    }

}
