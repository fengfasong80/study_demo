package com.stydy.bilibili;

/**
 * 测试
 * @author fengfasong
 * @date 2020/9/19
 */
public class MyMain {
    public static void main(String[] args) {
        Fans xm = new Fans("小明");
        Fans xh = new Fans("小红");
        xh.read();

        UpZhu upZhu = new UpZhu();
        upZhu.subscribe(xh);
        upZhu.subscribe(xm);

        upZhu.pushVideo("今天天气真好！");

    }
}
