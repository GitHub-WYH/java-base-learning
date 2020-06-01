package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:37
 * @Description: TODO
 * 如果需要将流中的元素映射到另一个流中，可以使用 map 方法。
 *
 * 这段代码中， map 方法的参数通过方法引用，将字符串类型转换成为了int类型（并自动装箱为 Integer 类对象）。
 */
public class Demo08StreamMap {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("10", "12", "18");
        Stream<Integer> result = original.map(str -> Integer.parseInt(str));
    }
}