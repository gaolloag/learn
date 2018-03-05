package com.gl.atomic;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        ReferenceQueue m;

        System.out.println(ai.getAndIncrement());

        System.out.println(ai.get());

        System.out.println(ai.getAndIncrement());

        System.out.println(ai.get());

    }


}