package com.gl.collection;

/**
 * @author gaoliang
 */
public class Father {

    public void f(){
        System.out.println("Father f()");
        f1();

    }

    public void f1(){
        System.out.println("Father f()");
    }

}