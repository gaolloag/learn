package com.gl.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gaoliang
 */
public class THashMap {

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static void main(String[] args) {

        int sshift = 0;
        int ssize = 1;
        // 计算并行级别 ssize，因为要保持并行级别是 2 的 n 次方
        while (ssize < 16) {
            ++sshift;
            ssize <<= 1;
        }
        System.out.println(sshift);
        System.out.println(ssize);

        int hash = THashMap.hash("123");
        System.out.println(hash);
        System.out.println(hash & 31);

        int n ;

        if ((n = 3) == 0){

        }

        System.out.println("-" + n);




        int initialCapacity = 20;
        int capacity = 1;
        while (capacity < initialCapacity) {

            capacity = capacity << 1;
        }

        System.out.println("==" + (1 << 3));



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

        Map<String,String> m = new HashMap<String,String>();
        m.put("1","a");
        m.put("2","b");
        System.out.println("xxx:" + m.put("2","c"));
        System.out.println("yyy:"+m.get("2"));

       /* for(Map<String,String> e = m;;){


            if (e != null) {
                break;
            }

        }*/
        System.out.println("over");

        System.out.println("zz:" + tableSizeFor(17));

        Map<String,String> curMap = new ConcurrentHashMap<String,String>();

        curMap.put("","");

        System.out.println(-4 << 1);

        System.out.println(Runtime.getRuntime().availableProcessors());

        int NCPU = Runtime.getRuntime().availableProcessors();

        System.out.println((32 >>> 3)/NCPU);
    }

    static int indexFor(int h, int length) {
        return h & (length-1);
    }

    static int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}