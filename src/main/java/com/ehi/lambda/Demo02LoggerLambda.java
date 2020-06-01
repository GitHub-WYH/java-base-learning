package com.ehi.lambda;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:35
 * @Description: TODO
 *
 * Lambda的优化写法:
 *  这样一来，只有当满足条件的时候才会进行三个字符串的拼接。否则不会拼接。
 */
public class Demo02LoggerLambda {
    private static void log(int level, MessageBuilder builder) {
        if (level == 1) {
            System.out.println(builder.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";
        log(1, () -> msgA + msgB + msgC);
    }
}