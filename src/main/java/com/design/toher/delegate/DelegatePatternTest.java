package com.design.toher.delegate;

public class DelegatePatternTest {
    public static void main(String[] args) {
        //创建孩子啊 小祖宗
        Boss boss = new Boss();
        // 爸爸做饭
        boss.setMother(new Mother());
        boss.command("cooking");
        System.out.println("================================");
        // 狗狗陪玩
        boss.command("play");
    }
}

