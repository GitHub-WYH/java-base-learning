package com.ehi.stream.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo01ForEach
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:25
 * @Description:
 *
 * 循环遍历的弊端
 * Java 8的Lambda让我们可以更加专注于做什么（What），而不是怎么做（How），这点此前已经结合内部类进行了对比说明。
 * 现在，我们仔细体会一下上例代码，可以发现：
 *
 * for循环的语法就是“怎么做”
 * for循环的循环体才是“做什么”
 * 为什么使用循环？因为要进行遍历。但循环是遍历的唯一方式吗？遍历是指每一个元素逐一进行处理，而并不是从第一个到最后
 * 一个顺次处理的循环。前者是目的，后者是方式。
 *
 * 试想一下，如果希望对集合中的元素进行筛选过滤：
 *
 * 将集合A根据条件一过滤为子集B；
 * 然后再根据条件二过滤为子集C。
 * 那怎么办？在Java 8之前的做法可能为：
 *
 */
public class Demo02NormalFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        /**
         * 这段代码中含有三个循环，每一个作用不同：
         *
         * 1. 首先筛选所有姓张的人；
         *
         * 2. 然后筛选名字有三个字的人；
         *
         * 3. 最后进行对结果进行打印输出。
         */
        List<String> zhangList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }
        List<String> shortList = new ArrayList<>();
        for (String name : zhangList) {
            if (name.length() == 3) {
                shortList.add(name);
            }
        }
        for (String name : shortList) {
            System.out.println(name);
        }
    }
}