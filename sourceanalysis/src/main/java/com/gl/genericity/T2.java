package com.gl.genericity;

/**
 * @author gaoliang
 */
public class T2 {

    /**
     * 要区分原始类型和泛型变量的类型
     * 在调用泛型方法的时候，可以指定泛型，也可以不指定泛型。
     * 在不指定泛型的情况下，泛型变量的类型为 该方法中的几种类型的同一个父类的最小级，直到Object。
     * 在指定泛型的时候，该方法中的几种类型必须是该泛型实例类型或者其子类。
     * */
    public static void main(String[] args) {
        //不指定泛型的时候
        int i=T2.add(1, 2); //这两个参数都是Integer，所以T为Integer类型
        Number f=T2.add(1, 1.2);//这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Number
        Object o=T2.add(1, "asd");//这两个参数一个是Integer，以风格是Float，所以取同一父类的最小级，为Object

        /**指定泛型的时候*/
        int a=T2.<Integer>add(1, 2);//指定了Integer，所以只能为Integer类型或者其子类
        //int b=T2.<Integer>add(1, 2.2);//编译错误，指定了Integer，不能为Float
        Number c=T2.<Number>add(1, 2.2); //指定为Number，所以可以为Integer和Float
    }

    /**
     * 这是一个简单的泛型方法
     */
    public static <T> T add(T x,T y){
        return y;
    }
}