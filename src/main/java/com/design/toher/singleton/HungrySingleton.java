package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 1:28 上午
 * @Version 1.0
 */
//常规写法
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
