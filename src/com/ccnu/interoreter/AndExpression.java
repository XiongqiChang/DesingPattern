package com.ccnu.interoreter;

public class AndExpression implements Expression {

    private Expression expression01 = null;
    private  Expression expression02 = null;

    public AndExpression(Expression expression01, Expression expression02){
        this.expression01 = expression01;
        this.expression02 = expression02;
    }
    @Override
    public boolean interpret(String context) {
        return expression01.interpret(context) && expression02.interpret(context);
    }
}
