package com.ehi.function;

import java.util.function.Predicate;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 15:02
 * @Description: TODO
 * 默认方法：and
 *
 * 既然是条件判断，就会存在与、或、非三种常见的逻辑关系。
 * 其中将两个 Predicate 条件使用“与”逻辑连接起来实现“并且”的效果时，可以使用default方法 and
 *
 * 如果要判断一个字符串既要包含大写“H”，又要包含大写“W”
 */

public class Demo16PredicateAnd {
    private static void method(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.and(two).test("Helloworld");
        System.out.println("字符串符合要求吗：" + isValid);
    }

    public static void main(String[] args) {
        method(s -> s.contains("H"), s -> s.contains("W"));
    }
}