package com.gaolloag.designPattern.动态代理.demo01;

/**
 * Created by jack.yang on 2017/7/10.
 */
public class RealSubject implements Subject{
    public void rent()
    {
        System.out.println("I want to rent my house");
    }

    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}
