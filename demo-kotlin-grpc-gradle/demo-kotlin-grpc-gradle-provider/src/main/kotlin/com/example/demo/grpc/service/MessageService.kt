package com.example.demo.grpc.service

import com.example.demo.grpc.proto.Message
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.devh.boot.grpc.server.service.GrpcService

@GrpcService
class MessageService : com.example.demo.grpc.proto.MessageServiceGrpcKt.MessageServiceCoroutineImplBase() {
    override suspend fun sendMessage(request: Message.MessageRequest): Message.MessageResponse {
        return Message.MessageResponse.newBuilder().setMessage("成功").setSuccess(true).build()
    }

    override fun sendMessageStream(requests: Flow<Message.MessageRequest>): Flow<Message.MessageResponse> {
        return flow {
            requests.collect{
                emit(Message.MessageResponse.newBuilder().setSuccess(true).setMessage("成功").build())
            }
        }
    }

    override fun sendMessageStream2(request: Message.MessageRequest): Flow<Message.MessageResponse> {
        return flow {
            emit(Message.MessageResponse.newBuilder().build());
        }
    }

    override suspend fun sendMessageStream3(requests: Flow<Message.MessageRequest>): Message.MessageResponse {
        return Message.MessageResponse.newBuilder().build()
    }
}