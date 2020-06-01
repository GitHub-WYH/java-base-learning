package com.ehi.interfaces;

/**
 * ClassName: MyInterface
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:15
 * @Description:
 *
 * 接口新特性
 * 接口默认方法
 * 当我们去实现某个框架提供的一个接口时，需要实现其所有的抽象方法，当该框架更新版本，在这个借口中加入了新的抽象方法时，
 * 我们就需要对项目重新编译，并且实现其新增的方法。
 *
 * 当实现类太多时，操作起来很麻烦。
 *
 * JDK之前是使用开闭设计模式：对扩展开放，对修改关闭。即：创建一个新的接口，继承原有的接口，定义新的方法。
 *
 * 但是这样的话，原本的那些实现类并没有新的方法
 *
 * 这时候可以使用接口默认方法
 *
 * 关键字使用default进行修饰， 方法需要方法体。这样的方法所有的子类会默认实现（不用自己写），如果想要覆盖重写，也可以在实现类中覆盖重写
 */

/**
 * 从java8开始，接口当中允许定义default默认方法
 * 修饰符：public default(public可以省略，default不能省略)
 *
 * 这里需要注意的是：这里的default是jdk8新增的关键字，和访问限定修饰符“default”不是一个概念，与switch中的default功能完全不同.
 *
 * 与抽象类的不同：抽象类更多的是提供一个模板，子类之间的某个流程大致相同，仅仅是某个步骤可能不一样（模板方法设计模式），
 * 这个时候使用抽象类，该步骤定义为抽象方法。而default关键字是用于扩展
 */
public interface MyInterface {

    void method1();

    void method2();

    default void methodNew() {
        System.out.println("接口默认方法执行");
    }
}