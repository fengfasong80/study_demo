package com.stydy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者,实现抽象被观察者的方法
 * @author fengfasong
 * @date 2020/9/19
 */
public class WeChatServer implements Observerable{

    private List<Observer> list;

    private String message;

    public WeChatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void resisterObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(list != null){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInformation(String s){
        this.message = s;
        System.out.println("更新消息："+s);
        notifyObserver();
    }
}
