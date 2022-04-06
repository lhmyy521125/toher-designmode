package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 2:14 上午
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy = null;

    private  LazyDoubleCheckSingleton(){}
    //双重检查
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy==null){
            synchronized(LazyDoubleCheckSingleton.class){
                if(lazy==null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
