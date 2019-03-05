package com.pattern.createtype.singleton;

/**
 * Description: 创建型-->单例模式
 *
 * @author zuogangju
 * @date 2019/3/4 13:42
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
	}
}
