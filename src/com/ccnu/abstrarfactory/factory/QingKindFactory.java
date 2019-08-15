package com.ccnu.abstrarfactory.factory;

import com.ccnu.abstrarfactory.product.*;

public class QingKindFactory implements  KingdomFactory {
    @Override
    public Castle createCastel() {
        return new QingCastle();
    }

    @Override
    public Arm createArm() {
        return new QingArm();
    }

    @Override
    public King createKing() {
        return  new QingKing();
    }
}
