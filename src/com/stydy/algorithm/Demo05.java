package com.stydy.algorithm;

import java.util.Arrays;

/**
 * 完数
 * @author fengfasong
 * @date 2021/3/4
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] pnum = getPnum(1000);
        Arrays.stream(pnum).forEach(p-> System.out.println(p));
    }

    /**
     * 查找范围内的完数
     * @param n
     * @return
     */
    public static int[] getPnum(int n){
        int[] arry = new int[5];
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= i/2 + 1; j++) {
                if(i % j == 0){
                    temp = temp + j;
                }
            }
            if(temp == i){
                arry[flag] = i;
                flag++;
                //System.out.println(i);
            }
        }
        return arry;
    }
}
