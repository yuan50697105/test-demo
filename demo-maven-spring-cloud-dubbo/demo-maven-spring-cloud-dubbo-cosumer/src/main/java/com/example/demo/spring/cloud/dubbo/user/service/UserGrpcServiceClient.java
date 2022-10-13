package com.example.demo.spring.cloud.dubbo.user.service;

import com.example.demo.spring.cloud.dubbo.user.entity.UserAddDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserUpdateDTO;
import com.example.demo.spring.cloud.dubbo.user.proto.UserEntity;
import com.example.demo.spring.cloud.dubbo.user.proto.UserServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class UserGrpcServiceClient {
    @GrpcClient("spring-cloud-dubbo-provider")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    public String add(UserAddDTO dto) {
        UserEntity.UserAddRequest.Builder builder = UserEntity.UserAddRequest.newBuilder();
        builder.setUsername(dto.getUsername());
        builder.setPassword(dto.getPassword());
        UserEntity.UserAddRequest userAddRequest = builder.build();
        return userServiceBlockingStub.add(userAddRequest).getMessageBytes().toStringUtf8();
    }

    public String update(UserUpdateDTO dto) {
        UserEntity.UserUpdateRequest.Builder builder = UserEntity.UserUpdateRequest.newBuilder();
        builder.setUsername(dto.getUsername());
        builder.setId(dto.getId());
        UserEntity.UserUpdateRequest build = builder.build();
        return userServiceBlockingStub.update(build).getMessageBytes().toStringUtf8();
    }
}
