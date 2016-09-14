package com.pattern.behaviortype.template;
/**
 * 
* @ClassName: Client
* @Description: 行为型-->模板方法模式
* @author zuozuo
* @date 2016年9月14日 下午3:10:34
 */
public class Client {
	public static void main(String[] args) {
		AbstractComputer comp = new WindowsComputer();
		comp.startUp();
		
		comp = new MacComputer();
		comp.startUp();
	}
}
