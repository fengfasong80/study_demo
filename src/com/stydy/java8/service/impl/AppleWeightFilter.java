package com.stydy.java8.service.impl;

import com.stydy.java8.entity.Apple;
import com.stydy.java8.service.ApplePredicate;

/**
 * 苹果重量过滤
 * @author fengfasong
 * @date 2020/10/9
 */
public class AppleWeightFilter implements ApplePredicate {
    @Override
    public boolean filterApple(Apple apple) {
        return apple.getWeight() > 20;
    }
}
