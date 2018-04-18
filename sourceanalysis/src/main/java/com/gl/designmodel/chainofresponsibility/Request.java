package com.gl.designmodel.chainofresponsibility;

/**
 * 请求
 * @author gaoliang
 */
public class Request {
    Level level;

    public Request(Level level) {
        System.out.println("开始请求...");
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}