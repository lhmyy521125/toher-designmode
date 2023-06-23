package com.design.toher.delegate;

/**
 * 小孩（老板）
 */
public class Boss {

    private Mother mother;

    public void setMother(Mother mother) {
        this.mother = mother;
    }
    public void command(String thing) {
        System.out.println("我是小祖宗，我现在需要: " + thing);
        mother.doing(thing);
    }
}
