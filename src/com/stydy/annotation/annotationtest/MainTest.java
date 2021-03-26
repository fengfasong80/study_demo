package com.stydy.annotation.annotationtest;

import com.stydy.annotation.bean.PersonBo;
import org.junit.Test;

/**
 * 自定义注解测试
 * @author fengfasong
 * @date 2020/8/31
 */
public class MainTest {

    @Test
    public void test01() throws Exception {
        PersonBo personBo = new PersonBo("李白","12345678900","780923704@qq.com");
        MyAnnotation.checkPhone(personBo);
        MyAnnotation.checkEmail(personBo);
    }
}
