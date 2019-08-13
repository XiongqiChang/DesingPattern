package com.ccnu.facaded;

import com.ccnu.facaded.Function.Light;
import com.ccnu.facaded.Function.Shower;
import com.ccnu.facaded.Function.TV;

/**
 * 这一次介绍的是门面模式（外观模式）
 * 定义：
 *  外部和一个系统之间进行打交道的话，我们需要有一个有一个外部的统一接入者进入到其中去的
 *  这个中介者模还是有区别的，比如我们去一个地方办事，本来你一次提交材料就可以，但是你需要进入到
 *  很多的部门进行提交材料这样就会很杂，我们抽象出一个统一的外观对象来进行交互
 *  我们一共需要的是三个角色，一个是客户访问端，还有一个是外观对象，还有就是对象
 */
public class Faced {

        private Light light;
        private TV tv;
        private Shower shower;

        public Faced(){
            light = new Light();
            tv = new TV();
            shower = new Shower();
        }

    /**
     * 我们定义一个统一的方法来操作所有的开关
     */
     public  void open(){
            light.openLight();
            shower.takeShow();
            tv.open();
        }
}
