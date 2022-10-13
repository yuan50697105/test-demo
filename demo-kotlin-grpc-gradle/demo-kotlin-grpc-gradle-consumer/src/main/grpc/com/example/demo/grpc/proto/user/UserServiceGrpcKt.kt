package com.example.demo.grpc.proto.user

import com.example.demo.grpc.proto.user.UserAddServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for UserAddService.
 */
public object UserAddServiceGrpcKt {
  public const val SERVICE_NAME: String = UserAddServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = UserAddServiceGrpc.getServiceDescriptor()

  public val addUserMethod: MethodDescriptor<UserService.UserAddRequest, UserService.UserResponse>
    @JvmStatic
    get() = UserAddServiceGrpc.getAddUserMethod()

  public val addUserStreamMethod:
      MethodDescriptor<UserService.UserAddRequest, UserService.UserResponse>
    @JvmStatic
    get() = UserAddServiceGrpc.getAddUserStreamMethod()

  /**
   * A stub for issuing RPCs to a(n) UserAddService service as suspending coroutines.
   */
  @StubFor(UserAddServiceGrpc::class)
  public class UserAddServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserAddServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        UserAddServiceCoroutineStub = UserAddServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addUser(request: UserService.UserAddRequest, headers: Metadata = Metadata()):
        UserService.UserResponse = unaryRpc(
      channel,
      UserAddServiceGrpc.getAddUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun addUserStream(requests: Flow<UserService.UserAddRequest>, headers: Metadata =
        Metadata()): Flow<UserService.UserResponse> = bidiStreamingRpc(
      channel,
      UserAddServiceGrpc.getAddUserStreamMethod(),
      requests,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the UserAddService service based on Kotlin coroutines.
   */
  public abstract class UserAddServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for UserAddService.addUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addUser(request: UserService.UserAddRequest): UserService.UserResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method UserAddService.addUser is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for UserAddService.addUserStream.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    public open fun addUserStream(requests: Flow<UserService.UserAddRequest>):
        Flow<UserService.UserResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method UserAddService.addUserStream is unimplemented"))

    public final override fun bindService(): ServerServiceDefinition =
        builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserAddServiceGrpc.getAddUserMethod(),
      implementation = ::addUser
    ))
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = UserAddServiceGrpc.getAddUserStreamMethod(),
      implementation = ::addUserStream
    )).build()
  }
}

/**
 * Holder for Kotlin coroutine-based client and server APIs for UserModifyService.
 */
public object UserModifyServiceGrpcKt {
  public const val SERVICE_NAME: String = UserModifyServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = UserModifyServiceGrpc.getServiceDescriptor()

  /**
   * A stub for issuing RPCs to a(n) UserModifyService service as suspending coroutines.
   */
  @StubFor(UserModifyServiceGrpc::class)
  public class UserModifyServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserModifyServiceCoroutineStub>(channel, callOptions) {
    public override fun build(channel: Channel, callOptions: CallOptions):
        UserModifyServiceCoroutineStub = UserModifyServiceCoroutineStub(channel, callOptions)
  }

  /**
   * Skeletal implementation of the UserModifyService service based on Kotlin coroutines.
   */
  public abstract class UserModifyServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    public final override fun bindService(): ServerServiceDefinition =
        builder(UserModifyServiceGrpc.getServiceDescriptor()).build()
  }
}
