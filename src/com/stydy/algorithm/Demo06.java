package com.stydy.algorithm;

/**
 * 反指数计算
 * @author fengfasong
 * @date 2021/3/4
 */
public class Demo06 {

    public static void main(String[] args) {
        System.out.println(countLength(10,2));
    }

    public static double countLength(double h,int n){
        double length = 0;
        for (int i = 0; i < n; i++) {
            length = h + length;
            h = h * 0.5;
            length = length + h;
        }

        return length-h;
    }
}
