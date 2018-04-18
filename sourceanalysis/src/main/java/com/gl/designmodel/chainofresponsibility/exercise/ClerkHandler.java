package com.gl.designmodel.chainofresponsibility.exercise;

/**
 * 职员处理者
 * @author gaoliang
 */
public class ClerkHandler extends Handler {

    public ClerkHandler() {
        super.type = "职员";
    }

    @Override
    public Long limit() {
        return 1000L;
    }


}