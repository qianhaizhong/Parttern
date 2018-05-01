package com.hzq.pattern.factory.abstractFactory;

import com.hzq.pattern.factory.Milk;

public abstract class AbstractFactory {
    /**
     * 获得一个蒙牛品牌的牛奶
     * @return
     */
    public abstract Milk getMengNiu();

    /**
     * 获得一个伊利品牌的牛奶
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得一个特仑苏品牌的牛奶
     * @return
     */
    public abstract Milk getTelunsu();
}
