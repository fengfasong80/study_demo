package com.stydy.huawei;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * @author fengfasong
 * @date 2021/1/4
 */
public class LastWord {

    public static int wordLength(String word){
        if(word.length() == 0){
            return 0;
        }
        String[] split = word.split(" ");
        String s = split[split.length - 1];
        return s.length();
    }

    public static void main(String[] args) {
        int hello_world = wordLength("hello world");
        System.out.println(hello_world);
    }
}
