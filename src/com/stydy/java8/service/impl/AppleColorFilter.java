package com.stydy.java8.service.impl;

import com.stydy.java8.entity.Apple;
import com.stydy.java8.service.ApplePredicate;

/**
 * 苹果颜色过滤
 * @author fengfasong
 * @date 2020/10/9
 */
public class AppleColorFilter implements ApplePredicate {
    @Override
    public boolean filterApple(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
