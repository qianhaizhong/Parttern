package com.hzq.pattern.factory.simpleFactory;

import com.hzq.pattern.factory.MengNiu;
import com.hzq.pattern.factory.Milk;
import com.hzq.pattern.factory.TelunSu;
import com.hzq.pattern.factory.Yili;

public class SimpleFactory
{
    public Milk getMilk(String name)
    {

        if ("特仑苏".equals(name))
        {
            return new TelunSu();
        }
        else if ("蒙牛".equals(name))
        {
            return new MengNiu();
        }
        else if ("伊利".equals(name))
        {
            return new Yili();
        }
        return null;
    }
}
