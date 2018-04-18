package com.gl.designmodel.chainofresponsibility.exercise;

/**
 * 借款请求
 * @author gaoliang
 */
public class BorrowRequest {

    /**
     *借款金额
     * */
    private Long money;

    public BorrowRequest(Long money) {
        this.money = money;
    }

    public Long getMoney() {
        return money;
    }
}