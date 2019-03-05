package com.pattern.behaviortype.observer;

/**
 * Description: 抽象观察者类，为所有具体观察者定义一个接口，在得到通知时更新自己
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 16:30
 */
public interface Observer {
    /**
     * 有更新
     *
     * @param message 消息
     */
    void update(String message);

}