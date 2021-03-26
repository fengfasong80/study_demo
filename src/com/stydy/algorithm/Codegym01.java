package com.stydy.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * codegym
 * @author fengfasong
 * @date 2021/3/6
 *
 *
 * 1.创建包含 10 个字符串的数组。
 * 2.创建包含 10 个数字的数组。
 * 3.从键盘输入 10 个字符串，然后将其放入字符串数组中。
 * 4.在数字数组的每个元素中，记录其字符串数组索引与数字数组当前索引一致的字符串的长度。
 * 1.0
 */
public class Codegym01 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 字母
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // 读取字符串
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // 在此编写你的代码
        int[] count = new int[alphabet.size()];
        for (String s : list) {
            for (char c : s.toCharArray()) {
                int index = alphabet.indexOf(c);
                if (index < 0) {
                    continue;
                }

                count[index]++;
            }
        }

    }
}
