package com.example.demo.grpc.command

import com.example.demo.grpc.client.MessageServiceClient
import com.example.demo.grpc.proto.Message.MessageRequest
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class MessageServiceCommander:CommandLineRunner {
    @Autowired
    private lateinit var messageServiceClient: MessageServiceClient
    override fun run(vararg args: String?) {
        val runBlocking: String = runBlocking {
            val sendMessage = messageServiceClient.sendMessage("aaa", "aaa", "aaa")
            val string = sendMessage.messageBytes.toString("UTF-8")
            sendMessage.success.toString() + string
        }
        println(runBlocking)

        val messageRequest = ArrayList<MessageRequest>()
        for (i in 1..1000){
            messageRequest.add(MessageRequest.newBuilder().setContent("").setReceiver(UUID.randomUUID().toString()).build())
        }
        val runBlocking1 = runBlocking {
            val sendMessageFlow = messageServiceClient.sendMessageFlow(messageRequest)
            sendMessageFlow.toList()
        }
        runBlocking1.onEach { messageResponse -> println(messageResponse.success.toString()+messageResponse.messageBytes.toString("UTF-8")) }
    }
}