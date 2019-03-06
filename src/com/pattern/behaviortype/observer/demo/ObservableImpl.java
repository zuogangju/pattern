package com.pattern.behaviortype.observer.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * Description: 被观察者
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 9:52
 */
public class ObservableImpl implements Observable {

    /**
     * 储存订阅者
     */
    private List<Observer> list = new ArrayList<>();

    @Override
    public void push(String msg) {
        for (Observer observer : list) {
            observer.update(msg);
        }

    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }
}
