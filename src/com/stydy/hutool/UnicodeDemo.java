package com.stydy.hutool;

import cn.hutool.core.text.UnicodeUtil;
import org.junit.Test;

/**
 * unicode编码
 * @author fengfasong
 * @date 2021/1/19
 */
public class UnicodeDemo {

    @Test
    public void test01(){
        String charset = "UTF_8";

        String content = "hutool工具学习";

        String unicode = UnicodeUtil.toUnicode(content);
        String string = UnicodeUtil.toString("\u0000");
        //System.out.println(unicode);
        System.out.println(string.length());

    }
}
