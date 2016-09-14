package com.pattern.createtype.singleton;

/**
 * 
* @ClassName: Client
* @Description: 创建型-->单例模式
* @author zuozuo
* @date 2016年9月14日 下午3:07:56
 */
public class Client {
	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
	}
}
