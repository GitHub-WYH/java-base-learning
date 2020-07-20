package com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy;

/**
 * ClassName: BuyHouse
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:05
 * @Description: TODO
 */
public class BuyHouse implements Buy {

    @Override
    public void buy(GoodsInfo goodsInfo) {
        System.out.println("占地：" + goodsInfo.getSize() + "平方，价格：" + goodsInfo.getPrice() + "元");
    }
}