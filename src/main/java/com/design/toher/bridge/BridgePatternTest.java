package com.design.toher.bridge;

public class BridgePatternTest {
    public static void main(String[] args) {
        CoffeeAdditive sugar = new SugarAdditive();
        CoffeeAdditive milk = new MilkAdditive();

        Coffee americanCoffeeWithSugar = new AmericanCoffee(sugar);
        Coffee latteCoffeeWithMilk = new LatteCoffee(milk);

        americanCoffeeWithSugar.brew(); // 输出：冲泡美式咖啡，添加糖
        System.out.println("==========================");
        latteCoffeeWithMilk.brew(); // 输出：冲泡拿铁咖啡，添加牛奶
    }
}
