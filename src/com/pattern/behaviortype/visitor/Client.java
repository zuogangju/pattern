package com.pattern.behaviortype.visitor;


/**
 * 
* @ClassName: Client
* @Description: 行为型-->访问者模式
* @author zuozuo
* @date 2016年9月14日 下午3:13:43
 */
public class Client {
	public static void main(String[] args) {
		//构建报表
		BusinessReport report = new BusinessReport();
		System.out.println("===== 给CEO看报表 =====");
		//设置访问者CEO
		report.showReport(new CEOVisitor());
		System.out.println("===== 给CTO看报表 =====");
		//设置访问者CTO
		report.showReport(new CTOVisitor());
	}
}
