package com.stydy.observer;

/**
 * 观察者，需要实现抽象观察者接口
 * @author fengfasong
 * @date 2020/9/19
 */
public class User implements Observer{

    private String name;

    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read(){
        System.out.println(name + "收到推送消息："+message);
    }
}
