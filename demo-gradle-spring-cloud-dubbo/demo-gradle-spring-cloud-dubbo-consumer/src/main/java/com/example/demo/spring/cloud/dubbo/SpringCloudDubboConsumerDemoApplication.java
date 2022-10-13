package com.example.demo.spring.cloud.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
@EnableFeignClients
public class SpringCloudDubboConsumerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboConsumerDemoApplication.class, args);
    }
}
