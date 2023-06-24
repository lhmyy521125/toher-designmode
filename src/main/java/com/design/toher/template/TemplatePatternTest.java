package com.design.toher.template;

public class TemplatePatternTest {
    public static void main(String[] args) {
        MakeupTemplate naturalMakeup = new NaturalMakeup();
        System.out.println("女友开始画自然妆：");
        naturalMakeup.doMakeup();

        System.out.println("------------------------");

        System.out.println("女友开始画魅力妖艳妆：");
        MakeupTemplate glamorousMakeup = new GlamorousMakeup();
        glamorousMakeup.doMakeup();
    }
}
