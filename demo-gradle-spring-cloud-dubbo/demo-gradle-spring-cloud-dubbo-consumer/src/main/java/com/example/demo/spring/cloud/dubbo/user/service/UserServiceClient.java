package com.example.demo.spring.cloud.dubbo.user.service;

import com.example.demo.spring.cloud.dubbo.user.client.IUserServiceClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("spring-cloud-dubbo-provider")
public interface UserServiceClient extends IUserServiceClient {
}
