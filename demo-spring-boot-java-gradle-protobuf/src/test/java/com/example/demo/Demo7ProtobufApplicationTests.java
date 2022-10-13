package com.example.demo;

import com.example.demo.protobuf.MessageUserEntity;
import com.example.demo.utils.HttpUtils;
import org.apache.http.HttpResponse;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class Demo7ProtobufApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        try {
            String uri = "http://127.0.0.1:8080/aaa";
            MessageUserEntity.MessageUserRequest.Builder builder = MessageUserEntity.MessageUserRequest.newBuilder();
            builder.setUsername("tom");
            builder.setPassword("123456");
            HttpResponse response = HttpUtils.doPost(uri, builder.build());
            MessageUserEntity.MessageUserResponse messageUserLoginResponse = MessageUserEntity.MessageUserResponse.parseFrom(response.getEntity().getContent());
            System.err.println(messageUserLoginResponse);
        } catch (Exception e) {

        }
    }

}
