package com.ehi.function;

import java.util.function.Supplier;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:51
 * @Description: TODO
 *
 * 练习：求数组元素的最大值
 */
public class Demo02Test {
    /**
     * 定一个方法,方法的参数传递Supplier,泛型使用Integer
     */
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 52, 333, 23};
        //调用getMax方法,参数传递Lambda
        int maxNum = getMax(() -> {
            //计算数组的最大值
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }
}