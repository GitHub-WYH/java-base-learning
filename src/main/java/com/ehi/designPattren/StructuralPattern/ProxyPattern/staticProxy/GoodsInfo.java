package com.ehi.designPattren.StructuralPattern.ProxyPattern.staticProxy;

/**
 * ClassName: GoodsInfo
 *
 * @Author: WangYiHai
 * @Date: 2020/7/20 17:05
 * @Description: TODO
 */
public class GoodsInfo {

    private Integer size;

    private Integer price;

    public GoodsInfo(Integer size, Integer price) {
        this.size = size;
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}