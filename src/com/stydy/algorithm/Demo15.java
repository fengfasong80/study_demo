package com.stydy.algorithm;

/**
 * 递归计算年龄
 * @author fengfasong
 * @date 2021/3/6
 */
public class Demo15 {

    public static void main(String[] args) {
        System.out.println(recAge(5, 2));
    }

    /**
     * 求m位同学的年龄
     * @param m 第几位同学
     * @param n 相差年龄
     * @return
     */
    private static int recAge(int m,int n){
        if(m == 1){
            return 10;
        }
        return recAge(m-1,n)+n;
    }
}
