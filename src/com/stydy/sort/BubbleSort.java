package com.stydy.sort;

/**
 *冒泡排序
 * @author fengfasong
 * @date 2021/1/4
 */
public class BubbleSort {
    
    public static int[] bubbleSort(int[] arry){
        if(arry.length == 0){
            return null;
        }
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = 0; j < arry.length-i-1; j++) {
               if(arry[j+1] < arry[j]){
                   int temp = arry[j];
                   arry[j] = arry[j+1];
                   arry[j+1] = temp;
               }
            }
        }
        return arry;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{12,43,2,6,11,23,76,22,16,19,42};
        int[] ints = bubbleSort(temp);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            System.out.print(" ");
        }
    }
}
