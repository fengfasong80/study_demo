package com.stydy.observer;

/**
 * 抽象被观察者，即被观察对象得变化
 * @author fengfasong
 * @date 2020/9/19
 */
public interface Observerable {
    public void resisterObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
