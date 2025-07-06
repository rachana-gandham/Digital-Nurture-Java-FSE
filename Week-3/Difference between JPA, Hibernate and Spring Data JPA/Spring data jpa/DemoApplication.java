package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("Anitha", "HR"));
            repository.save(new Employee("Rachana", "IT"));
            repository.save(new Employee("Charan", "Finance"));

            repository.findAll().forEach(System.out::println);
        };
    }
}
