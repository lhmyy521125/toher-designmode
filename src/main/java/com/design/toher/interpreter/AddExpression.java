package com.design.toher.interpreter;

public class AddExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public AddExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }
}