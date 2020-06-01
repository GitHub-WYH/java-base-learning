package com.ehi.function;

import java.util.function.Supplier;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:49
 * @Description: TODO
 *
 * Supplier
 * java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对象数据。
 * 由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象数据。
 */

public class Demo08Supplier {
    private static String getString(Supplier<String> function) {
        return function.get();
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        System.out.println(getString(() -> msgA + msgB));
    }
}