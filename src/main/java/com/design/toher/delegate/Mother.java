package com.design.toher.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义妈妈 委派者
 */
public class Mother implements Worker {

    private static Map<String, Worker> workerMap = new HashMap<>();

    public Mother() {
        workerMap.put("cooking", new Father());
        workerMap.put("play", new Dog());
    }

    /**
     * 做事情
     *
     * @param thing 任务
     */
    @Override
    public void doing(String thing) {
        System.out.println("我是妈妈，小祖宗Boss派活了: " + thing + "，我来指定委派任务: " + thing);
        if (workerMap.containsKey(thing)) {
            workerMap.get(thing).doing(thing);
        } else {
            System.err.println("目前没有可以指派的委派对象");
        }
    }

}
