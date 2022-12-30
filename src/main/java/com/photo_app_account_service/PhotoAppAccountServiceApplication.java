package com.photo_app_account_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppAccountServiceApplication.class, args);
    }
}
