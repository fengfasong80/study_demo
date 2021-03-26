package com.stydy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组计算
 * @author fengfasong
 * @date 2021/3/6
 */
public class Demo11 {

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // 创建并填充数组
        int[] arry = new int[20];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = buf.readLine();
            arry[i] = Integer.valueOf(s);
        }
        return arry;
    }

    public static int max(int[] array) {
        // 找出最大值
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
