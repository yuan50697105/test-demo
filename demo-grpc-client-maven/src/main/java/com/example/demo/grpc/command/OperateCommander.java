package com.example.demo.grpc.command;

import com.example.demo.grpc.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OperateCommander implements CommandLineRunner {
    @Autowired
    private OperateService operateService;

    @Override
    public void run(String... args) throws Exception {
        double v = operateService.get(1, 1);
        System.out.println(v);
    }
}
