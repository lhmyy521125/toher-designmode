package com.design.toher.delegate;

/**
 * 委派对象 爸爸
 */
public class Father implements Worker {

    @Override
    public void doing(String thing) {
        System.out.println("爸爸开始完成妈妈委托： " + thing);
        // 具体的任务处理逻辑
        // ...
    }
}
