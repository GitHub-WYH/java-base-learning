package com.ehi.lambda;

/**
 * ClassName: Demo01
 *
 * @Author: WangYiHai
 * @Date: 2020/4/13 11:59
 * @Description: TODO
 * Lambda表达式
 * 在面向对象的基础上，java8 通过Lambda表达式与方法引用等，为开发者打开了函数式编程的大门。Lambda表达式不是语法糖，而是新的语法
 *
 * 语法
 * 三要素：参数、箭头、代码
 *
 * (参数类型 参数1, 参数类型 参数2....) -> {代码}
 *
 * 如果参数有多个，那么使用逗号分隔。如果参数没有，则留空
 * 箭头是固定写法
 * 大括号相当于方法体。
 * 使用Lambda表达式的必要前提：必须是函数式接口
 *
 * Lambda 省略规则
 * 参数类型可以省略。但是只能同时省略所有参数的类型，或者干脆都不省略。
 * 如果参数有且仅有一个，那么小括号可以省略。
 * 如果大括号内的语句有且仅有一条，那么无论是否有返回值，return、大括号、分号都可以省略
 * Lambda的延迟执行
 * 有些场景的代码执行后，结果不一定会被使用，从而造成性能浪费。而Lambda表达式是延迟执行的，这正好可以作为解决方案，提升性能。
 *

 */

/**
 * 性能浪费的案例:
 *  这段代码存在问题：无论级别是否满足要求，作为 log 方法的第二个参数，三个字符串一定会首先被拼接并传入方法内，
 *  然后才会进行级别判断。如果级别不符合要求，那么字符串的拼接操作就白做了，存在性能浪费。
 */
public class Demo01Logger {
    private static void log(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";
        log(1, msgA + msgB + msgC);
    }

}