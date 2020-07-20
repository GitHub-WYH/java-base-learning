package com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy;

/**
 * ClassName: Customer
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:10
 * @Description: TODO
 * 静态代理在不违背开闭原则，提供了扩展目标对象功能的能力，但如果后序接口发生改动时，
 * 则会牵一发而动全身，导致其他实现类也要被动进行修改，从而导致后序对接口进行拓展的不便
 */
public class Customer {
    public static void main(String[] args){
        Buy buyHouse = new BuyHouse();
        HouseAgent houseAgent = new HouseAgent(buyHouse);
        houseAgent.buy(new GoodsInfo(120, 11000000));
    }
}