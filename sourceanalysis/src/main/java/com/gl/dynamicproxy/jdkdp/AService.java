package com.gl.dynamicproxy.jdkdp;

/**
 * 被代理类，即目标类target
 *
 * @author typ
 *
 */
public class AService implements Service {

    @Override
    public void add() {
        System.out.println("AService add>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void update() {
        System.out.println("AService update>>>>>>>>>>>>>>>");
    }
}