package com.ehi.stream.getStream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:29
 * @Description: TODO
 *
 * java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
 *
 * 获取一个流非常简单，有以下几种常用的方式：
 *
 * 所有的 Collection 集合都可以通过 stream 默认方法获取流；
 * Stream 接口的静态方法 of 可以获取数组对应的流。
 * 根据Collection获取流
 * 首先， java.util.Collection 接口中加入了default方法 stream 用来获取流，所以其所有实现类均可获取流。
 *
 */
public class Demo04GetStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
    }
}