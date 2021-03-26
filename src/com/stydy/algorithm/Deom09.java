package com.stydy.algorithm;

/**
 * 三个数排序
 * @author fengfasong
 * @date 2021/3/6
 */
public class Deom09 {

    public static void main(String[] args) {
        int i = bigNum(4, bigNum(5, 2));
        System.out.println(i);
    }

    public static int bigNum(int n,int m){
        if(m > n){
            return n;
        }
        return m;
    }
}
