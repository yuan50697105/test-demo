package com.example.demo.grpc.service.user;

import com.example.demo.grpc.proto.user.UserModifyServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserModifyService extends UserModifyServiceGrpc.UserModifyServiceImplBase {

}
