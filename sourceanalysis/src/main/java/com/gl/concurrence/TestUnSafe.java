package com.gl.concurrence;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author gaoliang
 */
public class TestUnSafe {

    private static final Unsafe U ;
    private static final long addressOfSampleClass;
    private static volatile Integer lockState = 0;
    static {
        try {
            //U = sun.misc.Unsafe.getUnsafe();

            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            U =  (Unsafe)f.get(null);

            addressOfSampleClass = U.getLong(lockState, 8L);

           /*
            LOCKSTATE = U.objectFieldOffset
                    (Unsafe.class.getDeclaredField("lockState"));*/
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {

        /**
         * 比较obj的offset处内存位置中的值和期望的值，如果相同则更新。此更新是不可中断的。
         *
         * @param obj 需要更新的对象
         * @param offset obj中整型field的偏移量
         * @param expect 希望field中存在的值
         * @param update 如果期望值expect与field的当前值相同，设置filed的值为这个新值
         * @return 如果field的值被更改返回true
         */
        U.compareAndSwapInt(lockState,addressOfSampleClass,0,1);
        System.out.println(lockState);
    }
    
}