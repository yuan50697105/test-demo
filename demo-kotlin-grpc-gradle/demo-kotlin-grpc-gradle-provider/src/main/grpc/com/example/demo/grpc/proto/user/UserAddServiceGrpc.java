package com.example.demo.grpc.proto.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: UserService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserAddServiceGrpc {

  private UserAddServiceGrpc() {}

  public static final String SERVICE_NAME = "UserAddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest,
      com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.example.demo.grpc.proto.user.UserService.UserAddRequest.class,
      responseType = com.example.demo.grpc.proto.user.UserService.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest,
      com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest, com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserMethod;
    if ((getAddUserMethod = UserAddServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserAddServiceGrpc.class) {
        if ((getAddUserMethod = UserAddServiceGrpc.getAddUserMethod) == null) {
          UserAddServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.user.UserService.UserAddRequest, com.example.demo.grpc.proto.user.UserService.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.user.UserService.UserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.user.UserService.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAddServiceMethodDescriptorSupplier("addUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest,
      com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUserStream",
      requestType = com.example.demo.grpc.proto.user.UserService.UserAddRequest.class,
      responseType = com.example.demo.grpc.proto.user.UserService.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest,
      com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserStreamMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.proto.user.UserService.UserAddRequest, com.example.demo.grpc.proto.user.UserService.UserResponse> getAddUserStreamMethod;
    if ((getAddUserStreamMethod = UserAddServiceGrpc.getAddUserStreamMethod) == null) {
      synchronized (UserAddServiceGrpc.class) {
        if ((getAddUserStreamMethod = UserAddServiceGrpc.getAddUserStreamMethod) == null) {
          UserAddServiceGrpc.getAddUserStreamMethod = getAddUserStreamMethod =
              io.grpc.MethodDescriptor.<com.example.demo.grpc.proto.user.UserService.UserAddRequest, com.example.demo.grpc.proto.user.UserService.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUserStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.user.UserService.UserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.proto.user.UserService.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAddServiceMethodDescriptorSupplier("addUserStream"))
              .build();
        }
      }
    }
    return getAddUserStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAddServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceStub>() {
        @java.lang.Override
        public UserAddServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceStub(channel, callOptions);
        }
      };
    return UserAddServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceBlockingStub>() {
        @java.lang.Override
        public UserAddServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceBlockingStub(channel, callOptions);
        }
      };
    return UserAddServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAddServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAddServiceFutureStub>() {
        @java.lang.Override
        public UserAddServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAddServiceFutureStub(channel, callOptions);
        }
      };
    return UserAddServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserAddServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(com.example.demo.grpc.proto.user.UserService.UserAddRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserAddRequest> addUserStream(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddUserStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.user.UserService.UserAddRequest,
                com.example.demo.grpc.proto.user.UserService.UserResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getAddUserStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.demo.grpc.proto.user.UserService.UserAddRequest,
                com.example.demo.grpc.proto.user.UserService.UserResponse>(
                  this, METHODID_ADD_USER_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class UserAddServiceStub extends io.grpc.stub.AbstractAsyncStub<UserAddServiceStub> {
    private UserAddServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUser(com.example.demo.grpc.proto.user.UserService.UserAddRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserAddRequest> addUserStream(
        io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAddUserStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserAddServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAddServiceBlockingStub> {
    private UserAddServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.grpc.proto.user.UserService.UserResponse addUser(com.example.demo.grpc.proto.user.UserService.UserAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAddServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserAddServiceFutureStub> {
    private UserAddServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAddServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAddServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.proto.user.UserService.UserResponse> addUser(
        com.example.demo.grpc.proto.user.UserService.UserAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_ADD_USER_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.example.demo.grpc.proto.user.UserService.UserAddRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse>) responseObserver);
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
        case METHODID_ADD_USER_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addUserStream(
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.proto.user.UserService.UserResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAddServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.proto.user.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAddService");
    }
  }

  private static final class UserAddServiceFileDescriptorSupplier
      extends UserAddServiceBaseDescriptorSupplier {
    UserAddServiceFileDescriptorSupplier() {}
  }

  private static final class UserAddServiceMethodDescriptorSupplier
      extends UserAddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAddServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAddServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getAddUserStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
