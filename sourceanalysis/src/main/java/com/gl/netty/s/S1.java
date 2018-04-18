package com.gl.netty.s;

/**
 * @author gaoliang
 */
public class S1 {


    public static void main(String[] args) {
        //System.out.println(1543%13);

        int length = 16;

        Long startTime = System.currentTimeMillis();

        int h = Math.abs("b".hashCode());

        System.out.println(h);
        int mod = h % length;
        int mod1 = h & 15;
        System.out.println(mod);
        System.out.println(mod1);
        //for(long i = 0; i <  1 << 30  ; i++){

        //}

        System.out.println(System.currentTimeMillis() - startTime);

    }
}