package com.design.toher.chain;

public class StockCheckHandler extends OrderHandler {
    @Override
    public void handleRequest(Order order) {
        // 执行库存检查的任务
        System.out.println("执行库存检查");

        // 判断是否需要传递给下一个处理器
        if (nextHandler != null) {
            nextHandler.handleRequest(order);
        }
    }
}