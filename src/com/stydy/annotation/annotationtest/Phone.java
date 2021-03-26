package com.stydy.annotation.annotationtest;

import java.lang.annotation.*;

/**
 * 电话号码检查
 * @author fengfasong
 * @date 2020/8/31
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String errorMsg();
}
