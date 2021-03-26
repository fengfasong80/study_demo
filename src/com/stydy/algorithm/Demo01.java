package com.stydy.algorithm;

/**
 * 兔子对数问题
 * @author fengfasong
 * @date 2021/3/2
 *
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21
 */
public class Demo01 {

    public static void main(String[] args) {
        int n = 3;
        int fun = fun(n);
        System.out.println(fun);
    }

    /**
     * 本月的兔子对数等于上两个月之合
     * @param n
     * @return
     */
    public static int fun(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
}
