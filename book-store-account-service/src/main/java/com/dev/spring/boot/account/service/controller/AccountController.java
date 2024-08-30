package com.dev.spring.boot.account.service.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/account")
@Tag(name = "Account Service", description = "Account Service")
public class AccountController {

    @GetMapping("/")
    public Mono<String> accountServiceMicroserviceController() {
        return Mono.just( "Welcome to CI/CD using java 17 spring boot framework");
    }

}
