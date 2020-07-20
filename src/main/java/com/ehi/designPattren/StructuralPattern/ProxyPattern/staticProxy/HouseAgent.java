package com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy;

/**
 * ClassName: HouseAgent
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:08
 * @Description: TODO
 */
public class HouseAgent implements Buy {

    private Buy buy;

    public HouseAgent(Buy buy) {
        this.buy = buy;
    }

    @Override
    public void buy(GoodsInfo goodsInfo) {
        System.out.println("AAA正在为你服务");
        buy.buy(goodsInfo);
        System.out.println("购买成功！");
    }
}