package com.stydy.bilibili;

/**
 * 抽象被观察者
 * @author fengfasong
 * @date 2020/9/19
 */
public abstract class ObserverAble {
    //订阅
    public abstract void subscribe(Observer observer);
    //取消订阅
    public abstract void disSubscribe(Observer observer);
    //推送通知
    public abstract void notifyMsg();

}
