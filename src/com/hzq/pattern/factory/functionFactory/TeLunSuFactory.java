package com.hzq.pattern.factory.functionFactory;

import com.hzq.pattern.factory.Milk;
import com.hzq.pattern.factory.TelunSu;

public class TeLunSuFactory implements Factory
{
    @Override
    public Milk getMilk() {
        return new TelunSu();
    }
}
