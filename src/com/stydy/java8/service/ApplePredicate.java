package com.stydy.java8.service;

import com.stydy.java8.entity.Apple;

/**
 * 苹果属性谓语
 * @author fengfasong
 * @date 2020/10/9
 */
public interface ApplePredicate {
    boolean filterApple(Apple apple);
}
