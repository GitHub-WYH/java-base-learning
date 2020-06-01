package com.ehi.interfaces;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:20
 * @Description:
 *
 * 函数式接口
 * 概念:函数式接口在Java中是指：有且仅有一个抽象方法的接口。
 *
 * 函数式接口，即适用于函数式编程场景的接口。而Java中的函数式编程体现就是Lambda，
 * 所以函数式接口就是可以适用于Lambda使用的接口。只有确保接口中有且仅有一个抽象方法，
 * Java中的Lambda才能顺利地进行推导。
 *
 * 格式
 * 确保接口中有且只有一个抽象方法即可:
 * Public interface 接口名称 {
 *      返回值 方法名称();
 * }
 */

/**
 * @FunctionalInterface注解
 * 有的注解是在编译期起作用，如@Override注解。而@FunctionalInterface也是在编译期起作用。
 * 该注解是java8专门为函数式接口引入的新的注解，作用于一个接口上。
 *
 * 一旦使用该注解来定义接口，编译期会强制检查该接口是否符合函数式接口的条件，不符合则会报错。
 * 需要注意的是：即使不使用该注解，只要满足函数式接口的定义，这就是一个函数式接口。
 *
 */
public class DemoFunctionalInterface {
    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(MyFunctionalInterface inter) {
        inter.myMethod();
    }

    public static void main(String[] args){
        // 调用使用函数式接口的方法
        doSomething(() -> System.out.println("乌鸦坐飞机"));
    }
}