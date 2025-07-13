package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country1.xml") 
public class SpringLearnWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnWebApplication.class, args);
    }
}
