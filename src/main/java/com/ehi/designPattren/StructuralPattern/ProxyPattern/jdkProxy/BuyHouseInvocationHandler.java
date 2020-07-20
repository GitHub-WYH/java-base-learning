package com.ehi.designPattren.StructuralPattern.ProxyPattern.jdkProxy;

import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.Buy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: BuyHouseInvocationHandler
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:13
 * @Description: TODO
 * JDK提供的代理涉及到了以下类：
 *
 * java.lang.reflect.Proxy：代理工具类，用于生成代理对象（newProxyInstance）
 * java.lang.reflect.InvocationHandler：调用代理对象方法时回调处理器
 */
public class BuyHouseInvocationHandler implements InvocationHandler {
    private Buy buy;

    public BuyHouseInvocationHandler(Buy buy) {
        this.buy = buy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("AAA正在为你服务");
        Object obj = method.invoke(buy, args);
        System.out.println("购买成功！");
        return obj;
    }
}