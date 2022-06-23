package com.kone.pbdemo.test;

import com.kone.pbdemo.protocol.User;

/**
 * @author Kone
 * @date 2022/1/29
 */
public class PbTest2 {
    public static void main(String[] args) {
        User user = User.newBuilder()
//                .setUserId(1)
//                .setUsername("testing")
                .setAge(1)
                .build();

        System.out.println(user);

        byte[] data = user.toByteArray();
        // 十六进制形式打印
        for (byte b : data) {
            System.out.printf("%02X", b & 0xFF);
        }
    }
}
