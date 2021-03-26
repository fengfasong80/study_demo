package com.stydy.java8.util;

import com.stydy.java8.entity.Apple;
import com.stydy.java8.service.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法工具类
 * @author fengfsong
 * @date 2020/10/9
 */
public class UtilTest {
    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(p.filterApple(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
