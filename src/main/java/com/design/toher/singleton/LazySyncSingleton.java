package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 2:14 上午
 * @Version 1.0
 */
public class LazySyncSingleton {

    private LazySyncSingleton(){}

    private static LazySyncSingleton lazy = null;

    public synchronized static LazySyncSingleton getInstance(){
        if(lazy==null){
            lazy = new LazySyncSingleton();
        }
        return lazy;
    }
}
