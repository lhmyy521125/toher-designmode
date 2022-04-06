package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 2:14 上午
 * @Version 1.0
 * 使用静态内部类方式解决线程安全
 */

public class LazyStaticSingleton {
    private LazyStaticSingleton(){
        if(lazyHolder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    private static final LazyStaticSingleton getInstance(){
        //return之前会先加载内部类lazyHolder
        return lazyHolder.LAZY;
    }
    //默认不会加载
    private static class lazyHolder{
        private static final LazyStaticSingleton LAZY = new LazyStaticSingleton();
    }
}
