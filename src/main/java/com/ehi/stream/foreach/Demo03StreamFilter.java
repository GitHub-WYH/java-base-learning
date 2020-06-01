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
 * 每当我们需要对集合中的元素进行操作的时候，总是需要进行循环、循环、再循环。这是理所当然的么？不是。
 * 循环是做事情的方式，而不是目的。另一方面，使用线性循环就意味着只能遍历一次。如果希望再次遍历，只能再使用另一个循环从头开始。
 *
 * 那，Lambda的衍生物Stream能给我们带来怎样更加优雅的写法呢？
 *
 */
public class Demo03StreamFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        /**
         * 直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：获取流、过滤姓张、过滤长度为3、逐一打印。
         * 代码中并没有体现使用线性循环或是其他任何算法进行遍历，我们真正要做的事情内容被更好地体现在代码中。
         */
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);
    }
}