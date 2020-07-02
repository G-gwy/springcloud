package com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"com.springcloud.consumer","com.gggsl.springcloud.api"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gggsl.springcloud.api"})
public class DeptConsumerFeign_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_80.class, args);
    }
}
