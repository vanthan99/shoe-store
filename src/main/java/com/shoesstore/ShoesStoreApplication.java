package com.shoesstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ShoesStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoesStoreApplication.class, args);
    }

}
