package com.design.toher.chain;

public class ResponsibilityChainTest {
    public static void main(String[] args) {
        // 创建处理器实例
        OrderHandler stockCheckHandler = new StockCheckHandler();
        OrderHandler priceCalculationHandler = new PriceCalculationHandler();
        OrderHandler couponValidationHandler = new CouponValidationHandler();
        OrderHandler orderGenerationHandler = new OrderGenerationHandler();

        // 构建处理器链
        stockCheckHandler.setNextHandler(priceCalculationHandler);
        priceCalculationHandler.setNextHandler(couponValidationHandler);
        couponValidationHandler.setNextHandler(orderGenerationHandler);

        // 创建订单
        Order order = new Order();

        // 将订单请求传递给处理器链的头部处理器
        stockCheckHandler.handleRequest(order);
    }
}
