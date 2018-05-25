package com.gl.threadanalysis.lock;

/**
 * @author gaoliang
 */
public class Case1 {
    public volatile int n;

    public void add() {
        n++;
    }
}