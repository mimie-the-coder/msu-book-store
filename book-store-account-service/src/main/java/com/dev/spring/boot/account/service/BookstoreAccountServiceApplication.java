package com.dev.spring.boot.account.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.dev.spring.boot*"})
public class BookstoreAccountServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookstoreAccountServiceApplication.class, args
        );
    }
}
