package com.gl.designpatterns.decorator;

/**
 * @author gaoliang
 */
public class ConcreteDecorterI extends Decorter {

    public ConcreteDecorterI(Component pComponent) {
        super(pComponent);
    }

    private void firest(){
        System.out.println("firest");
    }

    private void last(){
        System.out.println("last");
    }

    @Override
    public void operation(){
        firest();
        super.operation();
        last();
    }
}