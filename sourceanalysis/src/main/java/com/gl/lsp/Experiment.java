package com.gl.lsp;
/**
 * 逆变与协变用来描述类型转换（type transformation）后的继承关系，其定义：如果AA、BB表示类型，f(⋅)f(⋅)表示类型转换，≤≤表示继承关系（比如，A≤BA≤B表示AA是由BB派生出来的子类）；
 f(⋅)f(⋅)是逆变（contravariant）的，当A≤B时有f(B)≤f(A)f(B)≤f(A)成立；
 f(⋅)f(⋅)是协变（covariant）的，当A≤B时有f(A)≤f(B)成立f(A)≤f(B)成立；
 f(⋅)f(⋅)是不变（invariant）的，当A≤B时上述两个式子均不成立，即f(A)f(A)与f(B)f(B)相互之间没有继承关系。
 * */
/**
 * LSP包含以下四层含义：
 * 1.子类完全拥有父类的方法，且具体子类必须实现父类的抽象方法。
 * 2.子类中可以增加自己的方法。
 * 3.当子类覆盖或实现父类的方法时，方法的形参要比父类方法的更为宽松。
 * 4.当子类覆盖或实现父类的方法时，方法的返回值要比父类更严格。
 * @author gaoliang
 */
public class Experiment {

    static Number typeOf(Number a){

        Integer b = (Integer) a;

        return b;
    }

    public static void main(String[] args) {

        //Object o = Experiment.typeOf(1);
        System.out.println(0xFFFFFFFF);
    }
}