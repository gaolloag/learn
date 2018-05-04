package com.gl.designpatterns.chainofresponsibility.exercise;

/**
 * 责任处理抽象
 * @author gaoliang
 */
public abstract class Handler {

    /**
     * 责任链下一个
     * */
    private Handler nextHandler;

    /**
     * 类型
     * */
    protected String type;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void getType(String type) {
        this.type = type;
    }

    /**
     * 处理限制，详细传递
     * */
    public abstract Long limit();

    public void approveRequest(BorrowRequest request){

        if(request.getMoney() <= limit() ){
            System.out.println("贷款金额：" + request.getMoney() + "，审批人：" + this.type);
        }else{
            if(this.nextHandler != null){

                this.nextHandler.approveRequest(request);

            }else{
                System.out.println("没有处理者");
            }
        }
    }
}