package com.hzq.pattern.factory.functionFactory;

import com.hzq.pattern.factory.MengNiu;
import com.hzq.pattern.factory.Milk;

public class MengNiuFactory implements Factory
{
    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
