package com.example.demo.grpc.service

import com.example.demo.grpc.proto.Message
import kotlinx.coroutines.flow.Flow
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class MessageService : com.example.demo.grpc.proto.MessageServiceGrpcKt.MessageServiceCoroutineImplBase() {
    override suspend fun sendMessage(request: Message.MessageRequest): Message.MessageResponse {
        return super.sendMessage(request)
    }

    override fun sendMessageStream(requests: Flow<Message.MessageRequest>): Flow<Message.MessageResponse> {
        return super.sendMessageStream(requests)
    }

    override fun sendMessageStream2(request: Message.MessageRequest): Flow<Message.MessageResponse> {
        return super.sendMessageStream2(request)
    }

    override suspend fun sendMessageStream3(requests: Flow<Message.MessageRequest>): Message.MessageResponse {
        return super.sendMessageStream3(requests)
    }
}