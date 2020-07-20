package com.ehi.function;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 18:46
 * @Description:
 *
 * 方法引用
 * 冗余的Lambda场景
 * 在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案：拿什么参数做什么操作。
 * 那么考虑一种情况：如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再写重复逻辑？
 *
 * 先看一个简单的函数式接口
 *
 * 其中 printString 方法只管调用 Printable 接口的 print 方法，而并不管 print 方法的具体实现逻辑会将
 * 字符串打印到什么地方去。而 main 方法通过Lambda表达式指定了函数式接口 Printable 的具体操作方案为：拿
 * 到String（类型可推导，所以可省略）数据后，在控制台中输出它。
 *
 * 问题分析
 * 这段代码的问题在于，对字符串进行控制台打印输出的操作方案，明明已经有了现成的实现，那就是 System.out对象
 * 中的 println(String) 方法。既然Lambda希望做的事情就是调用println(String) 方法，那何必自己手动调用呢？
 *
 * 能否省去Lambda的语法格式（尽管它已经相当简洁）呢？只要“引用”过去就好了：如案例：Demo02PrintRef
 */
public class Demo01PrintSimple {
    private static void printString(Printable data) {
        data.print("Hello, World!");
    }

    public static void main(String[] args) {
        printString(s -> System.out.println(s));
    }
}