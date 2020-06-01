package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:39
 * @Description: TODO
 * 统计个数：count
 */
public class Demo09StreamCount {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.filter(s -> s.startsWith("张"));
        System.out.println(result.count());
    }
}