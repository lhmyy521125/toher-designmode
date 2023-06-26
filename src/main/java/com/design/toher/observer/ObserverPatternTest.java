package com.design.toher.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Girlfriend girlfriend = new Girlfriend();

        You you1 = new You("小明");

        girlfriend.addObserver(you1);

        girlfriend.setMood("开心", "太贵了我不想要");
        girlfriend.setMood("生气", "怎么可能是你的错，都是我的错！");
    }
}
