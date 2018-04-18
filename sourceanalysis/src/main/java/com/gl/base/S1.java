package com.gl.base;

/**
 * @author gaoliang
 */
public class S1 implements Runnable{
    public  static void of() {
        System.out.println("this is static");
    }


    @Override
    public void run() {

    }

    public static void main(String[] args) {
        S1.of();
        S1.of();
        S1.of();
    }

}