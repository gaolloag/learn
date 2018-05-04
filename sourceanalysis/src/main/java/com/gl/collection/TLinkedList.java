package com.gl.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @author gaoliang
 */
public class TLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        int max = 1 << 30;
        System.out.println(max);
        /*int maxa = 1 << 31;
        System.out.println(maxa);*/
        int i = Integer.MIN_VALUE;//, Integer.MAX_VALUE;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}