package com.gaolloag.java8.接口的默认方法与静态方法;

public class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}