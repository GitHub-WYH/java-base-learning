package com.ehi.lambda;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:46
 * @Description:
 *
 * 使用Lambda作为参数和返回值
 * 如果抛开实现原理不说，Java中的Lambda表达式可以被当作是匿名内部类的替代品。如果方法的参数是一个函数式接口类型，
 * 那么就可以使用Lambda表达式进行替代。使用Lambda表达式作为方法参数，其实就是使用函数式接口作为方法参数。
 *
 * 例如 java.lang.Runnable 接口就是一个函数式接口，假设有一个 startThread 方法使用该接口作为参数，那么就
 * 可以使用Lambda进行传参。这种情况其实和 Thread 类的构造方法参数为 Runnable 没有本质区别。
 */

public class Demo04Runnable {
    private static void startThread(Runnable task) {
        new Thread(task).start();
    }

    public static void main(String[] args) {
        startThread(() -> System.out.println("线程任务执行！"));
    }
}