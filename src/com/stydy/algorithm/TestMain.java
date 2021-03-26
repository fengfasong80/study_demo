package com.stydy.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * 测试
 * @author fengfasong
 * @date2021/3/7
 *
 *
 * 任务：程序从键盘读取一对（一个数字和字符串）并在屏幕上显示。
 * 新任务：程序从键盘读取对（一个数字和字符串），并将其存储在 HashMap。
 * 任何空的输入字符都表示数据输入结束。
 * 这些数字可以重复。
 * 字符串始终是唯一的。
 * 输入的数据不得丢失！
 * 然后该程序在屏幕上显示 HashMap 的内容。
 * 每个新行显示一对。
 */
public class TestMain {

    public static void main(String[] args) {
        Integer integer1 = 23;
        String str = Integer.toBinaryString(integer1);
        System.out.println("23在计算机的二进制表示"+str);

        String strYy = Integer.toBinaryString(integer1 >> 2);
        System.out.println(integer1 >> 2);
        System.out.println("23在计算机的二进制表示"+strYy);


    }
}
