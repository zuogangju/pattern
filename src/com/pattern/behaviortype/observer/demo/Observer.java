package com.pattern.behaviortype.observer.demo;

/**
 * Description: 观察者接口，为所有具体观察者定义
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 9:31
 */
public interface Observer {
    /**
     * 更新消息
     * @param msg 消息
     */
    void update(String msg);
}
