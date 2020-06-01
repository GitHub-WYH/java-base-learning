package com.ehi.stream.commonMethod;

import java.util.stream.Stream;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:35
 * @Description: TODO
 *
 * 逐一处理：forEach
 * 虽然方法名字叫forEach，但是与for循环不同
 *
 * 基本使用
 */
public class Demo12StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "周芷若");
        stream.forEach(name -> System.out.println(name));
    }
}