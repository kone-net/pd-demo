package com.kone.pbdemo.service;

import com.kone.pbdemo.protocol.User;
import com.kone.pbdemo.protocol.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author Kone
 * @date 2022/2/7
 */
//@GrpcService
public class MessageServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void getUser(User request, StreamObserver<User> responseObserver) {
        User user = User.newBuilder()
                .setName("message user")
                .build();
        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }
}
