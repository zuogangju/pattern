package com.pattern.behaviortype.chain;

/**
 * 
 * @ClassName: Client
 * @Description: 行为型-->责任链模式
 * @author zuozuo
 * @date 2016年9月14日 下午2:52:43
 */
public class Client {
	public static void main(String[] args) {
		// 构造各个领导对象
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		// 设置上级领导处理者对象
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;

		// 发起报账申请
		groupLeader.handleRequest(8000);

	}
}
