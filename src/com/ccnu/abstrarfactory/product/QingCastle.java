package com.ccnu.abstrarfactory.product;

public class QingCastle implements  Castle {
    static  final  String DESCRIPTIOIN = "咸阳";
    @Override
    public String getDescription() {
        return DESCRIPTIOIN;
    }
}
