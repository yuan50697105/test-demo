package com.example.demo.grpc.service;

import com.example.demo.grpc.proto.Message;
import com.example.demo.grpc.proto.MessageServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class MessageService extends MessageServiceGrpc.MessageServiceImplBase {
    @Override
    public void sendMessage(Message.MessageRequest request, StreamObserver<Message.MessageResponse> responseObserver) {
        log.info("接收参数"+request.toString());
        responseObserver.onNext(Message.MessageResponse.newBuilder().setSuccess(true).setMessage("成功").build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Message.MessageRequest> sendMessageStream(StreamObserver<Message.MessageResponse> responseObserver) {
        return new StreamObserver<Message.MessageRequest>() {
            @Override
            public void onNext(Message.MessageRequest messageRequest) {
                responseObserver.onNext(Message.MessageResponse.newBuilder().setMessage("成功").setSuccess(true).build());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void sendMessageStream2(Message.MessageRequest request, StreamObserver<Message.MessageResponse> responseObserver) {
        this.sendMessage(request,responseObserver);
    }
}