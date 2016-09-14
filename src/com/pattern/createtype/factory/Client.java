package com.pattern.createtype.factory;
/**
 * 
* @ClassName: Client
* @Description: 创建型-->工厂方法模式
* @author zuozuo
* @date 2016年9月14日 下午3:01:14
 */
public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product product = factory.createProduct(ConcreteProductB.class);
		product.method();
	}
}
