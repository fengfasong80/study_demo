package com.stydy.algorithm;

import java.util.Arrays;

/**
 * 倒序打印;给一个不多于5位的正整数，求他是几位数？逆序打印出各位数字
 * @author fengfasong
 * @date 2021/3/22
 */
public class Demo16 {

    public static void main(String[] args) {
        printNum(1234);
    }

    public static void printNum(int num){
        int[] arry = new int[5];
        int i = 0;
        while (num != 0){
            arry[i] = num%10;
            num = num/10;
            i++;
        }
        System.out.println(i);
        Arrays.stream(arry).forEach(p-> System.out.println(p));
    }
}
