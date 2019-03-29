package com.axiuj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
public class RestaurantConsumerStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantConsumerStoreApplication.class, args);
    }

}

