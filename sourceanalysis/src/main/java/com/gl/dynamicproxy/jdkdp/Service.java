package com.gl.dynamicproxy.jdkdp;

/**
 * 定义统一的接口
 * 该类是所有被代理类的接口类，jdk实现的代理要求被代理类基于统一的接口
 *
 * @author typ
 *
 */
public interface Service {
    /**
     * add方法
     */
    void add();

    /**
     * update方法
     */
    void update();
}
