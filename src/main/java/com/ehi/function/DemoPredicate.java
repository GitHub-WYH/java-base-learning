package com.ehi.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 15:05
 * @Description: TODO
 *
 * 练习：集合信息筛选
 * 数组当中有多条“姓名+性别”的信息如下，请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合ArrayList 中，需要同时满足两个条件：
 *
 * 1. 必须为女生；
 *
 * 2. 姓名为4个字。
 */

public class DemoPredicate {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        List<String> list = filter(array, s -> "女".equals(s.split(",")[1]), s -> s.split(",")[0].length() == 4);
        System.out.println(list);
    }

    private static List<String> filter(String[] array, Predicate<String> one, Predicate<String> two) {
        List<String> list = new ArrayList<>();
        for (String info : array) {
            if (one.and(two).test(info)) {
                list.add(info);
            }
        }
        return list;
    }
}