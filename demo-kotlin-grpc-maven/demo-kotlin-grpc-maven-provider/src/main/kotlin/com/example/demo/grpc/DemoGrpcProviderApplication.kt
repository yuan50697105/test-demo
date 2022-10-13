package com.example.demo.grpc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoGrpcProviderApplication {

}

fun main(vararg args: String) {
    runApplication<DemoGrpcProviderApplication>(*args);
}