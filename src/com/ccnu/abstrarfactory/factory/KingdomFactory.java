package com.ccnu.abstrarfactory.factory;

import com.ccnu.abstrarfactory.product.Arm;
import com.ccnu.abstrarfactory.product.Castle;
import com.ccnu.abstrarfactory.product.King;

/**
 * 定义的是一个王国抽象工厂，专门来创建王国里面的需要的产品
 */
public interface KingdomFactory {

    //创建的是城堡
    public Castle createCastel();

    //创建的是军队
    public Arm createArm();

    //创建的是国王
    public King createKing();
}
