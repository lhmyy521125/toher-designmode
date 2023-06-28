package com.design.toher.interpreter;

public class MultiplyExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public MultiplyExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret() {
        return leftOperand.interpret() * rightOperand.interpret();
    }
}
