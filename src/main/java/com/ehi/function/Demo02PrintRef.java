package com.ehi.function;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 18:47
 * @Description:
 *
 * 请注意其中的双冒号 :: 写法，这被称为“方法引用”，而双冒号是一种新的语法。
 */
public class Demo02PrintRef {
    private static void printString(Printable data) {
        data.print("Hello, World!");
    }

    public static void main(String[] args) {
        printString(System.out::println);
    }
}