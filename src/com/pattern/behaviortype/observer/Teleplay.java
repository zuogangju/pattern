package com.pattern.behaviortype.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Description: 具体的被观察者类，也就是订阅的节目
 *
 * @author zuogangju
 * @date 2019/3/4 16:31
 * @version V1.0
 */
public class Teleplay implements Observable{
	/**
	 * 储存订阅者
	 */
	private List<Observer> list = new ArrayList<>();
	
	@Override
	public void push(String message) {
		for(Observer observer:list){
			observer.update(message);
		}
	}

	@Override
	public void register(Observer observer) {
		list.add(observer);
	}

}
