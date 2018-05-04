package com.gl.designpatterns.decorator;

/**
 * @author gaoliang
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("say org 1");
    }
}