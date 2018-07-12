package com.ultra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @Author: ZhaoJP
 * @Date: 2018/6/15
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-server1.xml");
        context.start();
        System.in.read();
    }
}
