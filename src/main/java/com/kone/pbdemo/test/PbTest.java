package com.kone.pbdemo.test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.kone.pbdemo.protocol.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * @author Kone
 * @date 2022/1/29
 */
public class PbTest {
    public static void main(String[] args) {
        FileOuterClass.File file = FileOuterClass.File.newBuilder()
                .setName("fileName")
                .setSize(200)
                .build();
        User user = User.newBuilder()
                .setUserId(100)
                .putHobbys("pingpong", "play pingpong")
                .setCode(200)
                .setFile(file)
//                .setError("error string")
                .build();

        System.out.println(user);
        System.out.println(user.getMsgCase().getNumber());
        System.out.println(user.toByteArray());

        System.out.println(UserType.ADMIN.getNumber());

        try {
            FileOuterClass.File fileNew = FileOuterClass.File.parseFrom(file.toByteArray());
            System.out.println(fileNew);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        String host = "127.0.0.1";
        int port = 9090;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub = UserServiceGrpc.newBlockingStub(channel);
        User responseUser = userServiceBlockingStub.getUser(user);
        System.out.println(responseUser);

        FileServiceGrpc.FileServiceBlockingStub fileServiceGrpc = FileServiceGrpc.newBlockingStub(channel);
        FileOuterClass.File fileResponse = fileServiceGrpc.getFile(user);
        System.out.println(fileResponse);

        Iterator<User> users = userServiceBlockingStub.getUsers(user);
        while (users.hasNext()) {
            System.out.println(users.next());
        }

        channel.shutdown();
    }
}
