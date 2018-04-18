package com.gl.designmodel.chainofresponsibility;

/**
 * 处理3
 * @author gaoliang
 */
public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求由 ConcreteHandler3 处理");
        return new Response("响应结果 3");
    }
}