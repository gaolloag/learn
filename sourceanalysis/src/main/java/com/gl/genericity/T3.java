package com.gl.genericity;

import java.util.ArrayList;

/**
 * @author gaoliang
 * 类型擦除引起的问题及解决方法
 * 因为种种原因，Java不能实现真正的泛型，只能使用类型擦除来实现伪泛型，这样虽然不会有类型膨胀的问题，但是也引起了许多新的问题。
 * 1 先检查，在编译，以及检查编译的对象和引用传递的问题 (类型检查就是针对引用的)，要格外注意，泛型中的引用传递的问题
 */
public class T3 {
    private static void f1(){
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("123");
        //编译错误
        arrayList.add(123);
    }

    public static void main(String[] args) {
        T3.f1();
    }
}