package com.ccnu.abstrarfactory;

import com.ccnu.abstrarfactory.factory.KingdomFactory;
import com.ccnu.abstrarfactory.factory.QingKindFactory;
import com.ccnu.abstrarfactory.product.Arm;
import com.ccnu.abstrarfactory.product.Castle;
import com.ccnu.abstrarfactory.product.King;

public class Main {

    private King king;
    private Castle castle;
    private Arm arm;

    //创建一个国家
    public void createKingDom(KingdomFactory  factory){
            setArm(factory.createArm());
            setCastle(factory.createCastel());
            setKing(factory.createKing());
    }



    public King getKing() {
        return king;
    }

    public Castle getCastle() {
        return castle;
    }

    public Arm getArm() {
        return arm;
    }


    King getKing(KingdomFactory kingdomFactory){
        return  kingdomFactory.createKing();
    }


    Castle getCastle(KingdomFactory kingdomFactory){
        return  kingdomFactory.createCastel();
    }


    Arm getArm(KingdomFactory kingdomFactory){
        return  kingdomFactory.createArm();
    }

    public void setKing(King king) {
        this.king = king;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }


    /**
     * 制造王国的工厂
     */


    public  static  class factoryMaker{
        /**
         * 定义一个枚举类型来存储王国的类型
         */
        public enum  KingType{
            Qing
        }

        /**
         * c创建具体的工厂
         */
        public static  KingdomFactory makeFactory(KingType type){
            switch (type){
                case Qing:
                    return  new  QingKindFactory();
                default:
                    throw  new IllegalArgumentException("没有这个王国");//抛出这个异常
            }
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.createKingDom(factoryMaker.makeFactory(factoryMaker.KingType.Qing));
        System.out.println(main.getArm().getDescription());
        System.out.println(main.getCastle().getDescription());
        System.out.println(main.getKing().getDescription());
    }

}
