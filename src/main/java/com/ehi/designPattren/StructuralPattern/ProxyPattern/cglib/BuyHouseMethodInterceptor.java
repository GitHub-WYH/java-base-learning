package com.ehi.designPattren.StructuralPattern.ProxyPattern.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ClassName: BuyHouseMethodInterceptor
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:22
 * @Description: TODO
 */
public class BuyHouseMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("AAA正在为你服务");
        methodProxy.invokeSuper(o, objects);
        System.out.println("购买成功！");
        return null;
    }

/*    private Buy buy;

    public BuyHouseMethodInterceptor(Buy buy) {
        this.buy = buy;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("AAA正在为你服务");
        buy.buy((GoodsInfo) objects[0]);
        System.out.println("购买成功！");
        return null;
    }*/
}