package com.example.demo.protobuf.configure

import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter

@SpringBootConfiguration
class ProtoBufferConfigure {

    @Bean
    fun proto(): ProtobufHttpMessageConverter {
        return ProtobufHttpMessageConverter();
    }
}