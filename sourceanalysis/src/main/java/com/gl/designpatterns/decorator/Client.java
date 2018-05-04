package com.gl.designpatterns.decorator;

/**
 * @author gaoliang
 */
public class Client {
    public static void main(String[] args) {
        Component mConcreteComponent = new ConcreteComponent();

        Decorter mDecorterI = new ConcreteDecorterI(mConcreteComponent);


        Decorter mDecorterII = new ConcreteDecorterI(mDecorterI);


        mDecorterII.operation();

    }
}