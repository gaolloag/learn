package com.gl.concurrence;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public void atomicInt(){
        AtomicInteger ai = new AtomicInteger();

        ai.getAndIncrement();
    }


}