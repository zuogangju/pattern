package com.pattern.createtype.builder;
/**
 * 
* @ClassName: Client
* @Description: 创建型-->建造者模式
* @author zuozuo
* @date 2016年9月14日 下午2:51:59
 */
public class Client {
	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director director = new Director( builder ); 

		director.construct(); 
		//Product product = builder.getResult();
		
	}
}
