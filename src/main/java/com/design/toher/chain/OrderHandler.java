package com.design.toher.chain;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Order order);
}
