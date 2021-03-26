package com.stydy.algorithm;

/**
 * 猴子吃桃问题
 * @author fengfasong
 * @date 2021/3/6
 */
public class Demo10 {

    public static void main(String[] args) {
        int m = 1;
        for (int i = 0; i < 10; i++) {
            m = (m+1)*2;
            System.out.println(m);
        }
    }
}
