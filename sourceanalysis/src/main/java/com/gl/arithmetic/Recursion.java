package com.gl.arithmetic;

/**
 * 递归
 * @author gaoliang
 */
public class Recursion {
    public static int fibonacci(int n){
        switch(n){
            //出口条件一
            case 0:
                return 0;
            //出口条件二
            case 1:
                return 1;
            //在方法中调用自己
            default:
                return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}