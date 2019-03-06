package com.pattern.behaviortype.interpreter;
/**
 * 
* @ClassName: Client
* @Description: 行为型-->解释器模式
* @author zuozuo
* @date 2016年9月14日 下午2:59:27
 */
public class Client {
	public static void main(String[] args) {
		Calculator c = new Calculator("22 + 553 + 83 + 5");
		System.out.println("计算结果："+c.calculate());
	}
}
