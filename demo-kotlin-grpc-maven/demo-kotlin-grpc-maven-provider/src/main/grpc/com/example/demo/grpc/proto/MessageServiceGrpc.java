package com.example.demo.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: Message.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessageServiceGrpc {

  private MessageServiceGrpc() {}

  public static final String SERVICE_NAME = "MessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.example.demo.grpc.proto.Message.MessageRequest.class,
      responseType = com.example.demo.grpc.proto.Message.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = MessageServiceGrpc.getSendMessageMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getSendMessageMethod = MessageServiceGrpc.getSendMessageMethod) == null) {
          MessageServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("sendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessageStream",
      requestType = com.example.demo.grpc.proto.Message.MessageRequest.class,
      responseType = com.example.demo.grpc.proto.Message.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStreamMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStreamMethod;
    if ((getSendMessageStreamMethod = MessageServiceGrpc.getSendMessageStreamMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getSendMessageStreamMethod = MessageServiceGrpc.getSendMessageStreamMethod) == null) {
          MessageServiceGrpc.getSendMessageStreamMethod = getSendMessageStreamMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessageStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("sendMessageStream"))
              .build();
        }
      }
    }
    return getSendMessageStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessageStream2",
      requestType = com.example.demo.grpc.proto.Message.MessageRequest.class,
      responseType = com.example.demo.grpc.proto.Message.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream2Method() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream2Method;
    if ((getSendMessageStream2Method = MessageServiceGrpc.getSendMessageStream2Method) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getSendMessageStream2Method = MessageServiceGrpc.getSendMessageStream2Method) == null) {
          MessageServiceGrpc.getSendMessageStream2Method = getSendMessageStream2Method =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessageStream2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("sendMessageStream2"))
              .build();
        }
      }
    }
    return getSendMessageStream2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessageStream3",
      requestType = com.example.demo.grpc.proto.Message.MessageRequest.class,
      responseType = com.example.demo.grpc.proto.Message.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest,
      com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream3Method() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse> getSendMessageStream3Method;
    if ((getSendMessageStream3Method = MessageServiceGrpc.getSendMessageStream3Method) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getSendMessageStream3Method = MessageServiceGrpc.getSendMessageStream3Method) == null) {
          MessageServiceGrpc.getSendMessageStream3Method = getSendMessageStream3Method =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.Message.MessageRequest, com.example.demo.grpc.proto.Message.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessageStream3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.Message.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("sendMessageStream3"))
              .build();
        }
      }
    }
    return getSendMessageStream3Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub>() {
        @java.lang.Override
        public MessageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceStub(channel, callOptions);
        }
      };
    return MessageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub>() {
        @java.lang.Override
        public MessageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceBlockingStub(channel, callOptions);
        }
      };
    return MessageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub>() {
        @java.lang.Override
        public MessageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceFutureStub(channel, callOptions);
        }
      };
    return MessageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(com.example.demo.grpc.proto.Message.MessageRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageRequest> sendMessageStream(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendMessageStreamMethod(), responseObserver);
    }

    /**
     */
    public void sendMessageStream2(com.example.demo.grpc.proto.Message.MessageRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageStream2Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageRequest> sendMessageStream3(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendMessageStream3Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.Message.MessageRequest,
                com.example.demo.grpc.proto.Message.MessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getSendMessageStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.Message.MessageRequest,
                com.example.demo.grpc.proto.Message.MessageResponse>(
                  this, METHODID_SEND_MESSAGE_STREAM)))
          .addMethod(
            getSendMessageStream2Method(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.Message.MessageRequest,
                com.example.demo.grpc.proto.Message.MessageResponse>(
                  this, METHODID_SEND_MESSAGE_STREAM2)))
          .addMethod(
            getSendMessageStream3Method(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.Message.MessageRequest,
                com.example.demo.grpc.proto.Message.MessageResponse>(
                  this, METHODID_SEND_MESSAGE_STREAM3)))
          .build();
    }
  }

  /**
   */
  public static final class MessageServiceStub extends io.grpc.stub.AbstractAsyncStub<MessageServiceStub> {
    private MessageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(com.example.demo.grpc.proto.Message.MessageRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageRequest> sendMessageStream(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendMessageStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sendMessageStream2(com.example.demo.grpc.proto.Message.MessageRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSendMessageStream2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageRequest> sendMessageStream3(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendMessageStream3Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MessageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessageServiceBlockingStub> {
    private MessageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.grpc.proto.Message.MessageResponse sendMessage(com.example.demo.grpc.proto.Message.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.grpc.proto.Message.MessageResponse> sendMessageStream2(
        com.example.demo.grpc.proto.Message.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSendMessageStream2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessageServiceFutureStub> {
    private MessageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.proto.Message.MessageResponse> sendMessage(
        com.example.demo.grpc.proto.Message.MessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_SEND_MESSAGE_STREAM2 = 1;
  private static final int METHODID_SEND_MESSAGE_STREAM = 2;
  private static final int METHODID_SEND_MESSAGE_STREAM3 = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.example.demo.grpc.proto.Message.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE_STREAM2:
          serviceImpl.sendMessageStream2((com.example.demo.grpc.proto.Message.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMessageStream(
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse>) responseObserver);
        case METHODID_SEND_MESSAGE_STREAM3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMessageStream3(
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.Message.MessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.proto.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageService");
    }
  }

  private static final class MessageServiceFileDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier {
    MessageServiceFileDescriptorSupplier() {}
  }

  private static final class MessageServiceMethodDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getSendMessageStreamMethod())
              .addMethod(getSendMessageStream2Method())
              .addMethod(getSendMessageStream3Method())
              .build();
        }
      }
    }
    return result;
  }
}
