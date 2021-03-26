package com.stydy.algorithm;

import java.util.Arrays;

/**
 * 分解质因数
 * @author fengfasong
 * @date 2021/3/2
 */
public class Demo02 {
    public static void main(String[] args) {
        decompose(15);
    }

    public static void decompose(int n){

        for (int i = 2; i < n+1; i++) {
            while (n % i == 0 && n != i){
                n = n / i;
                System.out.println("i:"+i);
            }
            if(n == i){
                System.out.println(i);
                break;
            }
        }
    }
}
