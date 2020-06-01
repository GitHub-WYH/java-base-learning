package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:37
 * @Description: TODO
 * 可以通过 filter 方法将一个流转换成另一个子集流
 */
public class Demo07StreamFilter {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.filter(s -> s.startsWith("张"));
    }
}