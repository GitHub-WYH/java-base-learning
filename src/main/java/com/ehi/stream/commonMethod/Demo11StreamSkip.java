package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:41
 * @Description: 跳过前几个：skip
 */
public class Demo11StreamSkip {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.skip(2);
        System.out.println(result.count());
    }
}