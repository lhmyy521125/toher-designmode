package com.design.toher.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author 李怀明
 * @Date 2022/4/7 3:38 上午
 * @Version 1.0
 * 容器式单例模式
 */
public class ContainerSingleton {
    private ContainerSingleton() {}
    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();
    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
