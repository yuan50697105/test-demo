package com.example.demo.grpc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoGrpcConsumerApplication {

}

fun main(vararg args: String) {
    runApplication<DemoGrpcConsumerApplication>(*args);
}