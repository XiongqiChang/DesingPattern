package com.ccnu.abstrarfactory.product;

public class QingArm implements  Arm {

    static  final  String DESCRIPTIION = "大秦军队";
    @Override
    public String getDescription() {
        return DESCRIPTIION;
    }
}
