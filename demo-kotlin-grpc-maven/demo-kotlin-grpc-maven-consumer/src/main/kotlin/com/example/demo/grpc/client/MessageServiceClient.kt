package com.example.demo.grpc.client

import com.example.demo.grpc.proto.Message
import com.example.demo.grpc.proto.Message.MessageRequest
import com.example.demo.grpc.proto.MessageServiceGrpcKt
import io.grpc.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.stereotype.Service

@Service
class MessageServiceClient {

    @GrpcClient("message-service")
    lateinit var messageServiceCoroutineStub: MessageServiceGrpcKt.MessageServiceCoroutineStub

    suspend fun sendMessage(sender: String?, receiver: String?, content: String?): Message.MessageResponse {
        return messageServiceCoroutineStub.sendMessage(
            Message.MessageRequest.newBuilder().setSender(sender).setReceiver(receiver).setContent(content).build()
        )
    }

    suspend fun sendMessageFlow(messageRequest: List<MessageRequest>): Flow<Message.MessageResponse> {
        return messageServiceCoroutineStub.sendMessageStream(messageRequest.asFlow())
    }
}