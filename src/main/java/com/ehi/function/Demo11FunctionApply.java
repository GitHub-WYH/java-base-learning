package com.ehi.function;

import java.util.function.Function;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 15:05
 * @Description: TODO
 *
 * Function接口
 * java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件。
 *
 * 抽象方法：apply
 *
 * Function 接口中最主要的抽象方法为： R apply(T t) ，根据类型T的参数获取类型R的结果。使用的场景例如：将 String 类型转换为 Integer 类型
 */

public class Demo11FunctionApply {
    private static void method(Function<String, Integer> function) {
        int num = function.apply("10");
        System.out.println(num + 20);
    }

    public static void main(String[] args) {
        method(s -> Integer.parseInt(s));
    }
}