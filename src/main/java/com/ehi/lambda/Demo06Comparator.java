package com.ehi.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:46
 * @Description:
 *
 * 类似地，如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
 * 当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取
 */

public class Demo06Comparator {
    private static Comparator<String> newComparator() {
        return (a, b) -> b.length() - a.length();
    }

    public static void main(String[] args) {
        String[] array = {"abc", "ab", "abcd"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, newComparator());
        System.out.println(Arrays.toString(array));
    }
}