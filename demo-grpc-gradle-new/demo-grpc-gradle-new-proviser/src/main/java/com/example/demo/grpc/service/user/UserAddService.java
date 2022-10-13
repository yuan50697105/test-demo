package com.example.demo.grpc.service.user;

import com.example.demo.grpc.proto.user.UserAddServiceGrpc;
import com.example.demo.grpc.proto.user.UserService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserAddService extends UserAddServiceGrpc.UserAddServiceImplBase {
    @Override
    public void addUser(UserService.UserAddRequest request, StreamObserver<UserService.UserResponse> responseObserver) {
        super.addUser(request, responseObserver);
    }

    @Override
    public StreamObserver<UserService.UserAddRequest> addUserStream(StreamObserver<UserService.UserResponse> responseObserver) {
        return super.addUserStream(responseObserver);
    }
}
