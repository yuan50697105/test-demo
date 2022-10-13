package com.example.demo.grpc.configure;

import com.example.demo.grpc.service.OperateService;
import com.example.demo.grpc.service.impl.OperateServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class OperateConfigure {
    @Bean
    public OperateService operateService() {
        return new OperateServiceImpl("localhost",6565 );
    }
}
