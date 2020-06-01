package com.ehi.interfaces;

/**
 * ClassName: Animal
 *
 * @Author: WangYiHai
 * @Date: 2020/6/1 14:18
 * @Description: TODO
 */

/**
 * 从java8开始，接口当中允许定义静态方法
 * 修饰符：static xxx
 * 一般类的静态方法用法相同
 * 接口的静态方法不会被实现类所继承
 */
public interface Animal {

    void eat();

    static Animal getAnimal() {
        return new Cat();
    }
}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }
}