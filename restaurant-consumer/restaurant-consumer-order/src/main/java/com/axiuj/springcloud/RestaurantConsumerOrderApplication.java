package com.axiuj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
public class RestaurantConsumerOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantConsumerOrderApplication.class, args);
    }

}
