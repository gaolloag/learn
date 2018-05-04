package com.gl.designpatterns.chainofresponsibility.exercise;

/**
 * 使用者
 * @author gaoliang
 */
public class Client {
    public static void main(String[] args) {
        BorrowRequest request = new BorrowRequest(5100L);

        Handler clerk = new ClerkHandler();
        Handler leader = new LeaderHandler();
        Handler manager = new ManagerHandler();

        clerk.setNextHandler(leader);
        leader.setNextHandler(manager);

        clerk.approveRequest(request);
    }
}