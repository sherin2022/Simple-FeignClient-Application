package com.example.feignclientmicroservicesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignClientMicroServicesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientMicroServicesDemoApplication.class, args);
    }

}
