package com.stydy.sort;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author fengfasong
 * @date 2021/3/17
 */
public class TwoNum {

    public static boolean findNum(int[][] arry,int n){

        int rows = arry.length;
        int cols = arry[0].length;

        int row = 0;
        int col = cols-1;
        while (row < rows && col >= 0){
            if(n == arry[row][col]){
                return true;
            }else if(n < arry[row][col]){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
