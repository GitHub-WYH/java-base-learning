package com.ehi.function;

import java.util.function.Function;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 18:40
 * @Description: 默认方法：andThen
 */
public class Demo12FunctionAndThen {
    private static void method(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");
        System.out.println(num + 20);
    }

    public static void main(String[] args) {
        method(str -> Integer.parseInt(str) + 10, i -> i *= 10);
    }
}