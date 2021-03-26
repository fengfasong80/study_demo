package com.stydy.algorithm;

/**
 * 递归求阶乘
 * @author fengfasong
 * @date 2021/3/6
 */
public class Demo14 {
    public static void main(String[] args) {
        System.out.println(fun(3));
    }

    private static int fun(int n){
        if(n == 1){
            return 1;
        }
        return fun(n-1) * n;
    }
}
