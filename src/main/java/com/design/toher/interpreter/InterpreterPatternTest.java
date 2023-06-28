package com.design.toher.interpreter;

public class InterpreterPatternTest {
    public static void main(String[] args) {
        Expression expression = new AddExpression(
                new NumberExpression(2),
                new MultiplyExpression(
                        new NumberExpression(3),
                        new NumberExpression(4)
                )
        );

        int result = expression.interpret();
        System.out.println("本次计算结果:" + result);  // 输出: 14
    }
}
