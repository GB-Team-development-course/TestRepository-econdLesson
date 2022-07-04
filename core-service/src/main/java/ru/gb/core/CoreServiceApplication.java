package ru.gb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.gb")
public class CoreServiceApplication {
    public static void main(String[] args) {SpringApplication.run(CoreServiceApplication.class, args);}
}
