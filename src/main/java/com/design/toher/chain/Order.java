package com.design.toher.chain;

/**
 * 定义一个简单的订单对象
 * @author micro
 */
public class Order {

    //订单编号
    private String  OrderNo;

    //商品名称
    private String  GoodsName;

    //商品价格
    private String  GoodsPrice;

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public String getGoodsPrice() {
        return GoodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        GoodsPrice = goodsPrice;
    }
}
