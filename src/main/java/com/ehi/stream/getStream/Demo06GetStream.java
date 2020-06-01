package com.ehi.stream.getStream;

import java.util.stream.Stream;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:33
 * @Description: TODO
 * 如果使用的不是集合或映射而是数组，由于数组对象不可能添加默认方法，所以 Stream 接口中提供了静态方法
 *
 * of ，使用很简单：
 */
public class Demo06GetStream {
    public static void main(String[] args) {
        String[] array = {"张无忌", "张翠山", "张三丰", "张一元"};
        Stream<String> stream = Stream.of(array);
    }
}