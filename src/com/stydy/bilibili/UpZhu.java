package com.stydy.bilibili;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个up主
 * @author fengfasong
 * @date 2020/9/19
 */
public class UpZhu extends ObserverAble {
    //粉丝
    private List<Observer> list;
    //up发布的动态
    private String message;

    public UpZhu() {
       list = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void disSubscribe(Observer observer) {
        if(list != null){
            list.remove(observer);
        }
    }

    @Override
    public void notifyMsg() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void pushVideo(String s){
        this.message = s;
        notifyMsg();
    }
}
