package com.stydy.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
 * 然后输出输入字符串中该字母的出现次数。不区分大小写。
 * @author fengfasong
 * @date 2021/1/4
 */
public class CharNum {

    public static int charNum(String str,char a){
        if(str.length() == 0){
            return 0;
        }
        char[] chars = str.toLowerCase().toCharArray();
        char c = Character.toLowerCase(a);
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if(c == chars[i]){
                temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String str = "aAdertEsxa,fhuY?iud;";
        int a = charNum(str, 'a');
        System.out.println(a);

    }
}
