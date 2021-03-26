package com.stydy.funny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 数字输出
 * @author fengfasong
 * @date 2020/8/15
 */
public class NumberPrint {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void test01() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        Number number = Number.getNumber(str);
        switch (number){
            case ONE:
                System.out.println(number.getNumber());
                break;
            case TWO:
                System.out.println(number.getNumber());
                break;
            case THREE:
                System.out.println(number.getNumber());
                break;
            case FOUR:
                System.out.println(number.getNumber());
                break;
            case FIVE:
                System.out.println(number.getNumber());
                break;
            case SIX:
                System.out.println(number.getNumber());
                break;
            case SEVEN:
                System.out.println(number.getNumber());
                break;
            case EIGHT:
                System.out.println(number.getNumber());
                break;
            case NINE:
                System.out.println(number.getNumber());
                break;
            case ZERO:
                System.out.println(number.getNumber());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        test01();
    }
}
