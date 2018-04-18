package com.gl.designmodel.chainofresponsibility;

/**
 * 处理1
 * @author gaoliang
 */
public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求由 ConcreteHandler1 处理");
        return new Response("响应结果 1");
    }
}