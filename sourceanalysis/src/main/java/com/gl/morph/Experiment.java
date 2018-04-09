package com.gl.morph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoliang
 */
public class Experiment {
    public static void main(String[] args) {
        Number num = new Integer(1);
        ArrayList<Number> list = new ArrayList<Number>(); //type mismatch

        List<? extends Number> list1 = new ArrayList<Number>();
        list.add(new Integer(1)); //error
        list.add(new Float(1.2f));  //error

        List<Object> l1 = new ArrayList<Object>();
        l1.add("1");
        l1.add(1);

        List<? extends Number> l2 = new ArrayList<>();
        List<? super Number> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2.5);

        List<? extends Number> l4 = new ArrayList<>();
        //Integer s = l4.get(0);


    }
}