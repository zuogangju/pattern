package com.pattern.behaviortype.Iterator;

/**
 * 
* @ClassName: Client
* @Description: 行为型-->迭代器模式
* @author zuozuo
* @date 2016年9月14日 下午3:03:16
 */
public class Client {
	public static void main(String[] args) {
		Company hui = new CompanyHui();
		check(hui.iterator());
		
		Company min = new CompanyMin();
		check(min.iterator());
	}
	
	private static void check(Iterator iterator){
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
