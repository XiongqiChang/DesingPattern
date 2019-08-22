package com.ccnu.interoreter;

public class InterpretMain {
    /**
     * 定义规则
     */
    public  static  Expression getMaleExpression(){
        Expression roboret = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return  new OrExpression(roboret,john);
    }

    public  static Expression getMarriedExpression(){
        Expression juile = new TerminalExpression("Julie");
        Expression isMarriedMan = new TerminalExpression("Married");
        return  new AndExpression(juile,isMarriedMan);
    }

    public static void main(String[] args) {
        Expression isMan = getMaleExpression();
        Expression isMarried = getMarriedExpression();
        System.out.println("John is man" + isMan.interpret("John"));
        System.out.println("Julie is married women" + isMarried.interpret("Julie Married"));
    }
}
