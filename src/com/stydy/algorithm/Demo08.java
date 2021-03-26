package com.stydy.algorithm;

/**
 * 求未知数
 * @author fengfasong
 * @date 2021/3/6
 * 改未知数加上100是一个完全平方数，加上168是一个完全平方数
 */
public class Demo08 {

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if(isSqrt(i+100) && isSqrt(i+168)){
                System.out.println(i);
                break;
            }
        }
    }
    
    public static boolean isSqrt(int n){
        boolean isComp = false;
        for (int i = 0; i < Math.sqrt(n)+1; i++) {
            if(n == Math.pow(i,2)){
                isComp = true;
                break;
            }
        }
        return isComp;
    }
}
