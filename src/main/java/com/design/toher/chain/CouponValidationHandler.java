package com.design.toher.chain;

public class CouponValidationHandler extends OrderHandler {
    @Override
    public void handleRequest(Order order) {
        // 执行优惠券验证的任务
        System.out.println("执行优惠券验证");

        // 判断是否需要传递给下一个处理器
        if (nextHandler != null) {
            nextHandler.handleRequest(order);
        }
    }
}
