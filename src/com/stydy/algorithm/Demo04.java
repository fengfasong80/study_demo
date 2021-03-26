package com.stydy.algorithm;

/**
 * 求s=a+aa+aaa+...+a..的值
 * @author fegfasong
 * @date 2021/3/4
 */
public class Demo04 {

    public static void main(String[] args) {
        System.out.println(addNum(2,3));
    }
    public static int addNum(int a,int n){
        int sum = 0;
        int temp = a;
        if(n == 1){
            return a;
        }
        for (int i = 0; i < n; i++) {
            sum = sum + temp;
            temp = temp * 10 + a;
        }
        return sum;
    }
}
