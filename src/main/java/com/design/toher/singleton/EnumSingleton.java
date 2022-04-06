package com.design.toher.singleton;

/**
 * @Author 李怀明
 * @Date 2022/4/7 3:20 上午
 * @Version 1.0
 * 枚举式单例
 */
public enum EnumSingleton {

    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
