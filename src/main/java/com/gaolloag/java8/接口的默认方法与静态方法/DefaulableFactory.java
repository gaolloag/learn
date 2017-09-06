package com.gaolloag.java8.接口的默认方法与静态方法;

import java.util.function.Supplier;

public interface DefaulableFactory {
    static Defaulable create( Supplier< Defaulable > supplier ) {
        return supplier.get();
    }


}