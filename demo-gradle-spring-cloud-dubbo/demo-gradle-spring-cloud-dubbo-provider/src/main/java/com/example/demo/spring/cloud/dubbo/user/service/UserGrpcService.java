package com.example.demo.spring.cloud.dubbo.user.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.spring.cloud.dubbo.user.entity.UserEntityUtils;
import com.example.demo.spring.cloud.dubbo.user.proto.UserEntity;
import com.example.demo.spring.cloud.dubbo.user.proto.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {
    @Autowired
    private SystemUserService systemUserService;

    @Override
    public void add(UserEntity.UserAddRequest request, StreamObserver<UserEntity.UserResponse> responseObserver) {
        systemUserService.add(UserEntityUtils.copyAddData(request));
        responseObserver.onNext(UserEntity.UserResponse.newBuilder().setMessage(JSON.toJSONString(request)).build());
        responseObserver.onCompleted();
    }

    @Override
    public void update(UserEntity.UserUpdateRequest request, StreamObserver<UserEntity.UserResponse> responseObserver) {
        systemUserService.update(UserEntityUtils.copyUpdateData(request));
        responseObserver.onNext(UserEntity.UserResponse.newBuilder().setMessage(JSON.toJSONString(request)).build());
        responseObserver.onCompleted();
    }
}
