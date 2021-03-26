package com.stydy.sort;

/**
 * 插入排序
 * @author fengfasong
 * @date 2021/1/4
 */
public class InsertionSort {

    public static int[] insertionSort(int[] arry){
        if(arry.length == 0){
            return null;
        }

        for (int i = 0; i < arry.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arry[j] < arry[j-1]){
                    int temp = arry[j-1];
                    arry[j-1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        return arry;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{12,43,2,6,11,23,76,22,16,19,42};
        int[] ints = insertionSort(temp);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            System.out.print(" ");
        }
    }
}
