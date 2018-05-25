package com.gl.base.lm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gaoliang
 */
public class General {
    public static void main(String[] args) {
        List<A> as = new ArrayList<A>();

        for(int i = 0; i < 100000000; i++){
            A a1 = new A();
            a1.setName("a" + i);
            as.add(a1);
        }



        //6643
        Long start = System.currentTimeMillis();
        /*List<B> bs = new ArrayList<B>();
        for(A a : as){
            B b = new B();
            b.setBname(a.getName());
            bs.add(b);
        }*/

        //5703
        List<B> bs = as.stream().map( a ->{
                B b = new B();
        b.setBname(a.getName());
        return b;
        }).collect(Collectors.toList());
        System.out.println(bs.size());
        System.out.println(System.currentTimeMillis() - start);


    }

}