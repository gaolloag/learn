package com.gl.streamanalysis;

import org.assertj.core.util.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> ids = Lists.newArrayList(1,2,5,3,53,12);
        Collections.sort(ids,(o1,o2) -> o1.compareTo(o2));

        //ids.forEach((id) -> System.out.println(id));
        ids.forEach(System.out :: println);
      /*  List<String> names = Lists.newArrayList("TaoBao","ZhiFuBao");
        List<String> lowercaseNames = names.stream().map((String name) -> {return name.toLowerCase();}).collect(Collectors.toList());


        for(String name : lowercaseNames){
            System.out.println(name);
        }*/
        //nums.stream().filter(num -> num != null).count();


    }
}