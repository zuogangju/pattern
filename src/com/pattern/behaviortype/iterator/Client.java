package com.pattern.behaviortype.iterator;

/**
 * Description: 行为型-->迭代器模式
 *
 * @author zuogangju
 * @date 2019/3/5 9:15
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		Company hui = new CompanyHui();
		check(hui.iterator());
		
//		Company min = new CompanyMin();
//		check(min.iterator());
	}
	
	private static void check(Iterator iterator){
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
