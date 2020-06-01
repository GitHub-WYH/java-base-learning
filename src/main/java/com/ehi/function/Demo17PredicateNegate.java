package com.ehi.function;

import java.util.function.Predicate;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 15:03
 * @Description: TODO
 *
 * 默认方法：or
 *
 * 如果希望实现逻辑“字符串包含大写H或者包含大写W”，那么代码只需要将“and”修改为“or”名称即可，其他都不变：
 *
 * 默认方法：negate
 */

public class Demo17PredicateNegate {
    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }

    public static void main(String[] args) {
        method(s -> s.length() < 5);
    }
}