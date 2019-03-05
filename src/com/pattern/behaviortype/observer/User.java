package com.pattern.behaviortype.observer;

/**
 * Description: 具体的观察者类，也就是订阅者
 *
 * @author zuogangju
 * @date 2019/3/4 16:31
 * @version V1.0
 */
public class User implements Observer {

	@Override
	public void update(String message) {
		System.out.println(name + "," + message + "更新了！");

	}

	/**
	 * 订阅者的名字
	 */
	private String name;

	public User(String name) {
		this.name = name;
	}
}
