package com.stydy.observer;

/**
 * 模式测试
 * @author fengfasong
 * @date 2020/9/19
 */
public class ObserverTest {
    public static void main(String[] args) {
        User xh = new User("小红");
        User xm = new User("小明");
        User xl = new User("小兰");

        WeChatServer weChatServer = new WeChatServer();
        weChatServer.resisterObserver(xh);
        weChatServer.resisterObserver(xm);
        weChatServer.resisterObserver(xl);

        weChatServer.setInformation("微信美版改名we-com");
    }
}
