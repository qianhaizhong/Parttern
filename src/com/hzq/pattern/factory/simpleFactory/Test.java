package com.hzq.pattern.factory.simpleFactory;

import com.hzq.pattern.factory.TelunSu;

public class Test
{
    public static void main(String[] args)
    {
        //new的过程
        System.out.println(new TelunSu().getName());

        //简单工厂
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));

    }
}
