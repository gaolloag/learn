package com.gl.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoliang
 */
public class THashMap {
    public static void main(String[] args) {
        int initialCapacity = 20;
        int capacity = 1;
        while (capacity < initialCapacity) {

            capacity =capacity << 1;
        }

        //System.out.println(capacity);



        /*int index = indexFor(hash("qwerf".hashCode()),16);
        System.out.println(index);*/

        int length = 32;

        System.out.println(indexFor(16,length));
        System.out.println(indexFor(6,length));
        System.out.println(indexFor(8,length));


        System.out.println("-------------");

        Map map = new HashMap();
        map.put("1","2");
        int i = 15;
        System.out.println(30 & 0x1f);
    }

    static int indexFor(int h, int length) {
        return h & (length-1);
    }

    static int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}