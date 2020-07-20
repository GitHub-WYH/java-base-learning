package com.ehi.designPattren.StructuralPattern.ProxyPattern.jdkProxy;

import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.Buy;
import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.BuyHouse;
import com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy.GoodsInfo;

import java.lang.reflect.Proxy;

/**
 * ClassName: DynamicDemo
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:15
 * @Description: TODO
 */
public class DynamicDemo {
    public static void main(String[] args){
        BuyHouseInvocationHandler handler = new BuyHouseInvocationHandler(new BuyHouse());
        Buy buy = (Buy) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{Buy.class}, handler);
        buy.buy(new GoodsInfo(120,11111111));
    }
}