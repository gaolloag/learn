package com.gl.base;

/**
 * @author gaoliang
 */
public class ForCase {

    public static void main(String[] args) {
        int [] is = {1,2,3,4,5,6};

        for(int i:is){
            int [] js = {7,8,9,10};

            one:for(int j:js){
                if(j == 9){
                    break one;
                }
                System.out.println("j=" + j);
            }

            System.out.println(i);
        }
    }
}