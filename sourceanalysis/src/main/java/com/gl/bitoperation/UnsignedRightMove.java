package com.gl.bitoperation;

/**
 * @author gaoliang
 * 无符号右移 >>>
 * */
public class UnsignedRightMove {

    public static void main(String[] args) {

        //int 低五位 0 -31
        //左移32位无效果
        //long 低六位0-63

        int number = 1;
        //原始数二进制
        System.out.println(number + " -b " + binary(number));
        System.out.println(binary(number).length());
        number = number << 31;
        //左移一位
        System.out.println("<< -b " + binary(number));
        System.out.println(binary(number).length());
        System.out.println("<< -d " + (number));

        //number = number >> 1;
        //右移一位
        System.out.println(binary(number));
        System.out.println("-d " + (number));

        number = number >>> 16;
        System.out.println(">>> -b " + binary(number));
        System.out.println("-d " + (number));
    }
    /**
     * 输出一个int返回二进制数
     */
    private static String binary(int num) {
        return Integer.toBinaryString(num);
    }


    /**
     * 输入一个二机制返回十进制
     * */
    private static Integer decimalism(String binaryString){
        return Integer.parseInt(binaryString);
    }

}