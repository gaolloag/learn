package com.gl.designpatterns.decorator;

/**
 * @author gaoliang
 */
public abstract class Decorter extends Component {
    protected Component mComponent;

    public Decorter(Component pComponent) {

        this.mComponent = pComponent;
    }

    @Override
    public void operation() {

        mComponent.operation();
    }
}