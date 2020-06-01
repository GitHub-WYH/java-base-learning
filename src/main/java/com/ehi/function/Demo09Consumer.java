package com.ehi.function;

import java.util.function.Consumer;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:53
 * @Description: TODO
 *
 * java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，
 *
 * 其数据类型由泛型决定。
 *
 * 抽象方法：accept，意为消费一个指定泛型的数据
 */

public class Demo09Consumer {
    private static void consumeString(Consumer<String> function) {
        function.accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(s -> System.out.println(s));
    }

}