package com.example.demo.grpc.proto.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: UserService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserModifyServiceGrpc {

  private UserModifyServiceGrpc() {}

  public static final String SERVICE_NAME = "UserModifyService";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserModifyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceStub>() {
        @java.lang.Override
        public UserModifyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserModifyServiceStub(channel, callOptions);
        }
      };
    return UserModifyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserModifyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceBlockingStub>() {
        @java.lang.Override
        public UserModifyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserModifyServiceBlockingStub(channel, callOptions);
        }
      };
    return UserModifyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserModifyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserModifyServiceFutureStub>() {
        @java.lang.Override
        public UserModifyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserModifyServiceFutureStub(channel, callOptions);
        }
      };
    return UserModifyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserModifyServiceImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   */
  public static final class UserModifyServiceStub extends io.grpc.stub.AbstractAsyncStub<UserModifyServiceStub> {
    private UserModifyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserModifyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserModifyServiceStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class UserModifyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserModifyServiceBlockingStub> {
    private UserModifyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserModifyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserModifyServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class UserModifyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserModifyServiceFutureStub> {
    private UserModifyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserModifyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserModifyServiceFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserModifyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserModifyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserModifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserModifyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.proto.user.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserModifyService");
    }
  }

  private static final class UserModifyServiceFileDescriptorSupplier
      extends UserModifyServiceBaseDescriptorSupplier {
    UserModifyServiceFileDescriptorSupplier() {}
  }

  private static final class UserModifyServiceMethodDescriptorSupplier
      extends UserModifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserModifyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserModifyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserModifyServiceFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
