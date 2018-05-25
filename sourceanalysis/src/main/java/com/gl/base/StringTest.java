package com.gl.base;

/**
 * @author gaoliang
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "123";
        s.intern();
        //String s1 = new String("123");

       /* String s2 = "123";
        System.out.println(s == s1.intern());
        System.out.println(s == s2);
        System.out.println(s1 == s2);

        System.out.println("--------------黄金分割线--------------");

        String s4 = new String("abc");
        s4.intern();
        String s5 = "abc";
        System.out.println(s4 == s5);

        System.out.println("--------------黄金分割线--------------");
        String str2 = new String("str") + new String("01");
        str2.intern();
        String str1 = "str01";
        System.out.println(str2==str1);*/
    }
}