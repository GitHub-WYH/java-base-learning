package com.ehi.designPattren.StructuralPattern.ProxyPattern.cglib;

import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.Buy;
import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.BuyHouse;
import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.GoodsInfo;
import net.sf.cglib.proxy.Enhancer;

/**
 * ClassName: CglibDemo
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:20
 * @Description:
 * Cglib更加适合配合单例的方式使用，如需重复创建代理对象的情况，推荐使用JDK代理
 */
public class CglibDemo {
    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        //Cglib代理与JDK动态代理的最大区别在于JDK代理仅支持接口，而Cglib还支持普通类的代理，
        //因此上面例子我们能改成直接通过 Enhancer 代理 BuyHouse 对象
        //enhancer.setSuperclass(Buy.class);
        //enhancer.setCallback(new BuyHouseMethodInterceptor(new BuyHouse()));
        enhancer.setSuperclass(BuyHouse.class);
        enhancer.setCallback(new BuyHouseMethodInterceptor());
        Buy buy = (Buy) enhancer.create();
        buy.buy(new GoodsInfo(120,55555555));
    }
}