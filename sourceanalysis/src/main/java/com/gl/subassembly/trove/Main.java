package com.gl.subassembly.trove;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

/**
 * @author gaoliang
 */
public class Main {
    public static void main(String[] args) {
        TIntObjectMap map = new TIntObjectHashMap();
        for( int i = 0; i < 1000; i++){

            map.put(i, "2");
        }
        System.out.println(map.size());
    }
}