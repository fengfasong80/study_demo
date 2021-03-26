package com.stydy.hutool;

import cn.hutool.core.util.RandomUtil;
import org.junit.Test;

/**
 * 随机数
 * @author fengfasong
 * @date 2021/1/19
 */
public class RandomDemo {

    @Test
    public void test01(){
        for (int i = 0; i < 10; i++) {
            int n = RandomUtil.randomInt(1, 3);
            System.out.println(n);
        }

    }
}
