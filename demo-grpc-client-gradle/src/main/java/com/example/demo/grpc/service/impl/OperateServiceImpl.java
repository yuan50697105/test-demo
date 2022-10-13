package com.example.demo.grpc.service.impl;

import com.example.demo.grpc.protobuf.OperateGrpc;
import com.example.demo.grpc.protobuf.OperateType;
import com.example.demo.grpc.protobuf.Request;
import com.example.demo.grpc.service.OperateService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class OperateServiceImpl implements OperateService {
    private final ManagedChannel channel;
    private final OperateGrpc.OperateBlockingStub blockingStub;

    public OperateServiceImpl(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = OperateGrpc.newBlockingStub(channel);
    }

    public OperateServiceImpl(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).build());
    }

    @Override
    public double get(double num1, double num2) {
        return blockingStub.calculate(Request.newBuilder().setNum1(num1).setNum2(num2).setOpType(OperateType.Addition).build()).getResult();
    }



}
