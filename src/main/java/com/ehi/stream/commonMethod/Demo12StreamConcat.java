package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: aa
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:41
 * @Description: TODO
 * 组合：concat
 * 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat
 */
public class Demo12StreamConcat {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("张无忌");
        Stream<String> streamB = Stream.of("张翠山");
        Stream<String> result = Stream.concat(streamA, streamB);
    }
}