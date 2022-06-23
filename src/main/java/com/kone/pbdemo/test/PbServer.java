package com.kone.pbdemo.test;

import com.kone.pbdemo.service.FileServiceImpl;
import com.kone.pbdemo.service.MessageServiceImpl;
import com.kone.pbdemo.service.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author Kone
 * @date 2022/2/7
 */
public class PbServer {
    public static void main(String[] args) throws Exception {
        int port = 8082;
        Server server = ServerBuilder
                .forPort(port)
                .addService(new MessageServiceImpl())
                .addService(new UserServiceImpl())
                .addService(new FileServiceImpl())
                .build()
                .start();
        System.out.println("server started, port : " + port);
        server.awaitTermination();
    }
}
