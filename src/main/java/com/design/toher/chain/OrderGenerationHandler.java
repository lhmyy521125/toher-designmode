package com.design.toher.chain;

class OrderGenerationHandler extends OrderHandler {
    @Override
    public void handleRequest(Order order) {
        // 执行订单生成的任务
        System.out.println("执行订单生成");
    }
}