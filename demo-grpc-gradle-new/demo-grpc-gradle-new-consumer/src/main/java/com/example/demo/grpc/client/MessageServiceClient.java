package com.example.demo.grpc.client;

import com.example.demo.grpc.proto.Message;
import com.example.demo.grpc.proto.MessageServiceGrpc;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Channel;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageServiceClient {
    @GrpcClient("message-service")
    private Channel channel;
    private MessageServiceGrpc.MessageServiceStub messageServiceStub;
    private MessageServiceGrpc.MessageServiceBlockingStub messageServiceBlockingStub;
    private MessageServiceGrpc.MessageServiceFutureStub messageServiceFutureStub;
    public ListenableFuture<Message.MessageResponse> sendMessage(String sender, String receiver, String content){
        return messageServiceFutureStub.sendMessage(Message.MessageRequest.newBuilder().setSender(sender).setReceiver(receiver).setContent(content).build());
    }


    public void sendMessageStream(List<Message.MessageRequest> requests, StreamObserver<Message.MessageResponse> responseObserver){
        StreamObserver<Message.MessageRequest> requestStreamObserver = messageServiceStub.sendMessageStream(responseObserver);
        for (Message.MessageRequest request : requests) {
            requestStreamObserver.onNext(request);
        }
        requestStreamObserver.onCompleted();
    }

    @PostConstruct
    public void init(){
        this.messageServiceBlockingStub=MessageServiceGrpc.newBlockingStub(channel);
        this.messageServiceStub= MessageServiceGrpc.newStub(channel);
        this.messageServiceFutureStub=MessageServiceGrpc.newFutureStub(channel);
    }


    public Message.MessageResponse sendMessage(Message.MessageRequest request) {
        return messageServiceBlockingStub.sendMessage(request);
    }
}
