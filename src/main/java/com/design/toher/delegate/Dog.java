package com.design.toher.delegate;

/**
 * 委派对象 狗狗
 */
public class Dog implements Worker {

    @Override
    public void doing(String thing) {
        System.out.println("狗狗开始完成妈妈委托： " + thing);
        // 具体的任务处理逻辑
        // ...
    }
}
