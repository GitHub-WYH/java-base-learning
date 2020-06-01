package com.ehi.stream.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo01ForEach
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 10:25
 * @Description:
 * 说到Stream便容易想到I/O Stream，而实际上，在Java 8中，得益于Lambda所带来的函数式编程，
 * 引入了一个全新的Stream概念，用于解决已有集合类库既有的弊端。
 *
 *  
 *
 * Stream流式操作性能比传统的For循环要低，就性能而言，传统的for循环最高
 *
 * 传统集合的遍历代码
 * 几乎所有的集合（如 Collection 接口或 Map 接口等）都支持直接或间接的遍历操作。
 * 而当我们需要对集合中的元素进行操作的时候，除了必需的添加、删除、获取外，最典型的就是集合遍历。例如：
 */
public class Demo01ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        for (String name : list) {
            System.out.println(name);
        }
    }
}