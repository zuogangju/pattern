package com.pattern.behaviortype.observer;
/**
 * 
* @ClassName: Client
* @Description: 行为型-->观察者模式
* @author zuozuo
* @date 2016年9月14日 下午3:05:56
 */
public class Client {
	public static void main(String[] args) {
		//被观察者，这里就是用户订阅的电视剧
		Teleplay teleplay = new Teleplay();
		//观察者，这里就是订阅用户
		User user1 = new User("小明");
		User user2 = new User("小光");
		User user3 = new User("小兰");
		//订阅
		teleplay.register(user1);
		teleplay.register(user2);
		teleplay.register(user3);
		//推送新消息
		teleplay.push("xxx电视剧");
	}
}
