package com.example.demo.grpc.command;

import com.example.demo.grpc.client.MessageServiceClient;
import com.example.demo.grpc.proto.Message;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;

@Component
@Slf4j
public class MessageServiceStreamCommander implements CommandLineRunner {
    @Autowired
    private MessageServiceClient messageServiceClient;
    @Override
    public void run(String... args) throws Exception {
        ArrayList<Message.MessageRequest> requests = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            requests.add(Message.MessageRequest.newBuilder().setSender(UUID.randomUUID().toString()).setReceiver(UUID.randomUUID().toString()).build());
        }
        messageServiceClient.sendMessageStream(requests, getResponseObserver());
    }

    private static StreamObserver<Message.MessageResponse> getResponseObserver() {
        return new StreamObserver<Message.MessageResponse>() {
            @Override
            public void onNext(Message.MessageResponse messageResponse) {
                log.info(messageResponse.getSuccess()+messageResponse.getMessageBytes().toString(StandardCharsets.UTF_8));
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(),throwable);
            }

            @Override
            public void onCompleted() {
                log.info("completed");
            }
        };
    }
}
