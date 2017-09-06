package com.gaolloag.java8.接口的默认方法与静态方法;

public class Test {
    public static void main(String[] args) {
        /*Defaulable defaul = new DefaulableImpl();
        System.out.println(defaul.notRequired());

        Defaulable defaul1 = new OverridableImpl();
        System.out.println(defaul1.notRequired());*/

        Defaulable defaulable = DefaulableFactory.create( DefaulableImpl::new );
        System.out.println( defaulable.notRequired() );

        defaulable = DefaulableFactory.create( OverridableImpl::new );
        System.out.println( defaulable.notRequired() );
    }
}