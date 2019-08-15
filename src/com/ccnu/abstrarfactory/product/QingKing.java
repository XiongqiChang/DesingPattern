package com.ccnu.abstrarfactory.product;

public class QingKing implements  King {
    static  final  String DESCRIPTION ="大秦王朝";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
