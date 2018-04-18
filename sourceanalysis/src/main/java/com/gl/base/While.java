package com.gl.base;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gaoliang
 */
public class While {

    transient volatile static Integer[] table;

    public static void main(String[] args) {




        int[] ints = {1,2,3,222,2};

        int kw = 222;

        for(int i = 0; i < ints.length; i++){
            for(int j = 0; j < 10;j++){

            }

            if (ints[i] == kw) {
                System.out.println("xx");
                break;
            }
            System.out.println("zz");
        }


        int kw1 = 222;
        System.out.println(kw == kw1);


       /* for (Integer[] tab = table;;) {

            System.out.println("11");
        }*/

        for (int i = 0, bound = 1;;) {
            System.out.println(bound);
            bound = 2;

        }
    }
}