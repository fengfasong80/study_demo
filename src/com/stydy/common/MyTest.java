package com.stydy.common;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

/**
 * 测试
 */
public class MyTest {

    @Test
    public void test01(){
        System.out.println(BigInteger.probablePrime(2,new Random()));
    }

    @Test
    public void test02(){
        PrintNum printNum = new PrintNum(3);
        printNum.print(5);
        printNum.print();

    }
}
