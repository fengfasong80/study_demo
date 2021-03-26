package com.stydy.algorithm;

/**
 * 最大公约数与最小公倍数（辗除法）
 * @author fengfasong
 * @date 2021/3/3
 * 辗除法
 */
public class Demo03 {
    public static void main(String[] args) {
        min_max(18,16);
    }
    private static void min_max(int m,int n){
        int p = m * n;
        int temp = 0;
        if(n < m){
            temp = n;
            n = m;
            m = temp;
        }
        while (m != 0){
            temp = n % m;
            n = m;
            m = temp;
        }
        System.out.println("最大公约数："+n);
        System.out.println("最大公倍数："+ p / n);
    }
}
