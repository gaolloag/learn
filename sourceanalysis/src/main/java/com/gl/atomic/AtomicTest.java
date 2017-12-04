package com.gl.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {

        AtomicInteger ai = new AtomicInteger(1);
        ai.get();
    }
}