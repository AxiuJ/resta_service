package com.axiuj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class RestaurantProviderOrderformApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantProviderOrderformApplication.class, args);
    }

}
