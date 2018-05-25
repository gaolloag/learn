package com.gl.arithmetic;

/**
 * 快速排序
 * @author gaoliang
 */
public class QuickSort {


    public static void quickSort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }

        int pivot = a[left];//定义基准值为数组第一个数
        int i = left;
        int j = right;

        while (i < j) {
            //从右往左找比基准值小的数
            while (pivot <= a[j] && i < j) {
                j--;
            }
            //从左往右找比基准值大的数
            while (pivot >= a[i] && i < j) {
                i++;
            }
            //如果i<j，交换它们
            if (i < j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //把基准值放到合适的位置
        a[left] = a[i];
        a[i] = pivot;
        //对左边的子数组进行快速排序
        quickSort(a, left, i - 1);
        //对右边的子数组进行快速排序
        //quickSort(a,i+1,right);
    }


    public static void main(String[] args) {
        int[] array = {6,3,4,1,9,10,2,5};

        quickSort(array,0,array.length-1);
        for(int i :array){
            System.out.println(i);
        }
    }
}