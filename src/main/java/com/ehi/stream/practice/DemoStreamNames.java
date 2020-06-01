package com.ehi.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:42
 * @Description: TODO
 * 现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
 *
 * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
 *
 * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
 *
 * 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
 *
 * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
 *
 * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
 *
 * 6. 根据姓名创建 Person 对象；存储到一个新集合中。
 *
 * 7. 打印整个队伍的Person对象信息。
 *
 * 练习：集合元素处理（Stream方式）
 */
public class DemoStreamNames {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        // 第一个队伍只要名字为3个字的成员姓名；
        // 第一个队伍筛选之后只要前3个人；
        Stream<String> streamOne = one.stream().filter(s -> s.length() == 3).limit(3);
        // 第二个队伍只要姓张的成员姓名；
        // 第二个队伍筛选之后不要前2个人；
        Stream<String> streamTwo = two.stream().filter(s -> s.startsWith("张")).skip(2);
        // 将两个队伍合并为一个队伍；
        // 根据姓名创建Person对象；
        // 打印整个队伍的Person对象信息。
        Stream.concat(streamOne, streamTwo).map(Person::new).forEach(System.out::println);
    }
}

