package com.gl.mapanalysis;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoliang
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        int h;
        Object key = "456";
        String str = "456";
        System.out.println(key.hashCode());

        System.out.println(Integer.toBinaryString(key.hashCode()));
        System.out.println(Integer.toBinaryString(key.hashCode()).length());

        System.out.println(str.hashCode() >>> 16);
        h = (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(h);

        map.put("1","2");
        map.get("1");

        boolean b = "".equals("");



        int a[] = {2, 3, 4, 3, 4, 2};
        System.out.println("--" + findLost(a));

    }


    public static int findLost(int a[]){
        int result=0;
        for(int i=0;i<a.length;i++) {
            result^=a[i];
        }
        return result;
    }
}