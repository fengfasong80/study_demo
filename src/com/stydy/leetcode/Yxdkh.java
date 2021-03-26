package com.stydy.leetcode;

import java.util.*;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * @author fengfasong
 * @date 2020/8/29
 */
public class Yxdkh {

    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }

    public static boolean isValid(String str) {
        if(str.length() % 2 !=0){
            return false;
        }
        Map<Character,Character> paris = new HashMap<Character, Character>(){{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0;i <str.length();i++){
            char ch = str.charAt(i);
            if(paris.containsKey(ch)){
                if(stack.isEmpty() || !stack.peek().equals(paris.get(ch))){
                    return false;
                }
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
