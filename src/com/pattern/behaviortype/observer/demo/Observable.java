package com.pattern.behaviortype.observer.demo;


/**
 * Description: 被观察者
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 9:31
 */
public interface Observable {
    /**
     * 推送消息
     * @param msg 消息
     */
    void push(String msg);

    /**
     * 订阅
     * @param observer 观察者
     */
    void register(Observer observer);
}
