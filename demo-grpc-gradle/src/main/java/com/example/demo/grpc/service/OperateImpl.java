package com.example.demo.grpc.service;

import com.example.demo.grpc.protobuf.OperateGrpc;
import com.example.demo.grpc.protobuf.Request;
import com.example.demo.grpc.protobuf.Response;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class OperateImpl extends OperateGrpc.OperateImplBase {
    @Override
    public void calculate(Request request, StreamObserver<Response> responseObserver) {
        double v = request.getNum1() + request.getNum2();
        responseObserver.onNext(Response.newBuilder().setResult(v).build());
        responseObserver.onCompleted();
    }
}
