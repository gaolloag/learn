package com.gl.genericity.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author gaoliang
 */
public class GenericReading {
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static class Reader<T> {
        T readExact(List<? extends T> list) {
            return list.get(0);
        }

        <T> void writeWithWildcard(List<? super T> list, T item) {
            list.add(item);
        }
    }

    static void f1() {
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        // Errors: List<Fruit> cannot be applied to List<Apple>.
        Fruit f = fruitReader.readExact(apples);
        //writeWithWildcard(fruit, new Apple());




        List<? extends Fruit> flist = new ArrayList<Apple>();
        //flist.add(null);
    }
    public static void main(String[] args) {
        f1();
    }
}