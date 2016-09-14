package com.pattern.structuretype.decorator;
/**
 * 
* @ClassName: Client
* @Description: 结构型-->装饰模式
* @author zuozuo
* @date 2016年9月14日 下午2:58:45
 */
public class Client {
	public static void main(String[] args) {
		//首先有一个男孩
		Person person = new Boy();
		
		//在家
		PersonCloth personCloth = new HomeCloth(person);
		personCloth.dressed();
		System.out.println("--------------");
		//出门
		PersonCloth personCloth1 = new OutsideCloth(person);
		personCloth1.dressed();
		
	}
}
