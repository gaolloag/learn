package com.gl.designpatterns.chainofresponsibility;

/**
 * 处理2
 * @author gaoliang
 */
public class ConcreteHandler2 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(2);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求由 ConcreteHandler2 处理");
        return new Response("响应结果 2");
    }
}