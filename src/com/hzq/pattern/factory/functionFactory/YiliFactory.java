package com.hzq.pattern.factory.functionFactory;

import com.hzq.pattern.factory.Milk;
import com.hzq.pattern.factory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
