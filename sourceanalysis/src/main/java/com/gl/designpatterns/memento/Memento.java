package com.gl.designpatterns.memento;

/**
 * @author gaoliang
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}