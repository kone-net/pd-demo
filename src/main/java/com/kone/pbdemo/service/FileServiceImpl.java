package com.kone.pbdemo.service;

import com.kone.pbdemo.protocol.FileOuterClass;
import com.kone.pbdemo.protocol.FileServiceGrpc;
import com.kone.pbdemo.protocol.User;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Kone
 * @date 2022/2/7
 */
@GrpcService
public class FileServiceImpl extends FileServiceGrpc.FileServiceImplBase {
    @Override
    public void getFile(User request, StreamObserver<FileOuterClass.File> responseObserver) {
        FileOuterClass.File file = FileOuterClass.File.newBuilder()
                .setName("picture.png")
                .setSize(2000)
                .build();
        responseObserver.onNext(file);
        responseObserver.onCompleted();
    }
}
