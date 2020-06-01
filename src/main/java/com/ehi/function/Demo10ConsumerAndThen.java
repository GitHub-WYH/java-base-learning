package com.ehi.function;

import java.util.function.Consumer;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:54
 * @Description: TODO
 *
 * 默认方法：andThen
 *
 * 如果一个方法的参数和返回值全都是 Consumer 类型，那么就可以实现效果：
 * 消费数据的时候，首先做一个操作，然后再做一个操作，实现组合。而这个方法就是 Consumer 接口中的default方法 andThen
 *
 * 要想实现组合，需要两个或多个Lambda表达式即可，而 andThen 的语义正是“一步接一步”操作。例如两个步骤组合的情况
 */

public class Demo10ConsumerAndThen {
    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(s -> System.out.println(s.toUpperCase()), s -> System.out.println(s.toLowerCase()));
    }
}