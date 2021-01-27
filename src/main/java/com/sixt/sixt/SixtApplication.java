package com.sixt.sixt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SixtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SixtApplication.class, args);
    }

}
