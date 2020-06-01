package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:40
 * @Description: TODO
 * 取用前几个：limit
 */
public class Demo10StreamLimit {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.limit(2);
        System.out.println(result.count());
    }
}