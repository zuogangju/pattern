package com.pattern.behaviortype.observer;

/**
 * Description: 抽象被观察者类
 *
 * @author zuogangju
 * @date 2019/3/4 16:30
 * @version V1.0
 */
public interface Observable {

	/**
	 * 推送消息
	 * 
	 * @param message 内容
	 */
	void push(String message);

	/**
	 * 订阅
	 * 
	 * @param observer 订阅者
	 */
	void register(Observer observer);
}
