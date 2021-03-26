package com.stydy.sort;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @author fengfasong
 * @date 2021/3/17
 */
public class ReSpace {

    public static String reSpace(String str){
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
