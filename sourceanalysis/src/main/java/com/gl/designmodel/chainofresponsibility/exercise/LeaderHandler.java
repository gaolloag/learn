package com.gl.designmodel.chainofresponsibility.exercise;

/**
 * 领导处理者
 * @author gaoliang
 */
public class LeaderHandler extends Handler {
    public LeaderHandler() {
        super.type = "组长";
    }

    @Override
    public Long limit() {
        return 5000L;
    }
}