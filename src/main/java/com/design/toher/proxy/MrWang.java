package com.design.toher.proxy;

/**
 * @Author 李怀明
 * @Date 2022/4/7 11:40 下午
 * @Version 1.0
 * 王先生是一个人 需要找女朋友
 */
public class MrWang implements Person {
    @Override
    public void findGirlFriend() {
        System.out.println("王先生的要求是个女人就行");
    }
}
