package com.ehi.lambda;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:36
 * @Description: TODO
 *
 * 证明Lambda的延迟
 */

public class Demo03LoggerDelay {
    private static void log(int level, MessageBuilder builder) {
        if (level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";
        log(2, () -> {
            System.out.println("Lambda执行！");
            return msgA + msgB + msgC;
        });
    }

}