package com.gl.designpatterns.chainofresponsibility.exercise;

/**
 * 经理处理者
 * @author gaoliang
 */
public class ManagerHandler extends Handler {

    public ManagerHandler() {
        super.type = "经理";
    }

    @Override
    public Long limit() {
        return 10000L;
    }
}