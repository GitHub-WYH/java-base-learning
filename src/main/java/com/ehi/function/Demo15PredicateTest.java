package com.ehi.function;

import java.util.function.Predicate;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:57
 * @Description: TODO
 *
 * Predicate接口
 * 有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。这时可以使用java.util.function.Predicate<T> 接口。
 *
 * 抽象方法：test
 *
 * Predicate 接口中包含一个抽象方法： boolean test(T t) 。用于条件判断的场景：
 */

public class Demo15PredicateTest {
    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }

    public static void main(String[] args) {
        //条件判断的标准是传入lambda表达式逻辑
        method(s -> s.length() > 5);
    }
}