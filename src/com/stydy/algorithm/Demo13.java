package com.stydy.algorithm;


import java.io.*;
import java.util.ArrayList;

/**
 * 阶乘累加
 * @author fengfasong
 * @date 2021/3/6
 *
 *
 * 任务：用户从键盘输入单词（和数字）列表。单词按升序显示，数字按降序显示。
 */
public class Demo13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    /**
     * 排序，根据字母与数字分开排序
     * @param array
     */
    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // the string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // not a hyphen
            {
                return false;
            }
        }
        return true;
    }
}
