package com.gl.gc;

/**
 * @author gaoliang
 */
public class Case1 {


    public static void main(String[] args) {
        byte[] b= new byte[4*1024*1024];

        int i = 1;
        Integer ii = Integer.valueOf(i);
        Integer j = 2;
       /* System.out.print("Xmx=");
        System.out.println(Runtime.getRuntime().maxMemory()/1024.0/1024+"M");

        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024+"M");

        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024+"M");
*/
    }
}