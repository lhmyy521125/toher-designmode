package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 2:14 上午
 * @Version 1.0
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton lazy = null;

    public static LazySingleton getInstance(){
        if(lazy==null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
