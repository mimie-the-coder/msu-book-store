package com.dev.spring.boot.api.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookstoreApiGatewayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookstoreApiGatewayServiceApplication.class, args
        );
    }
}
