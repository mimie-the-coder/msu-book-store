package com.dev.spring.boot.catalog.service.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@OpenAPIDefinition
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() throws IOException {

        return new OpenAPI()
                .info(new Info()
                        .title("MSU BOOK STORE DISTRIBUTED SYSTEM")
                        .description("This is a sample  RESTful service using springdoc-openapi and OpenAPI 3.")
                        .termsOfService("terms")
                        .contact(new Contact().email("gwaunzamitchel@gmail.com"))
                        .license(new License().name("CIMAS"))
                        .version("v1.0")
                );
    }

}