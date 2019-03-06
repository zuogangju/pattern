package com.pattern.behaviortype.iterator.company;

import com.pattern.behaviortype.iterator.Company;
import com.pattern.behaviortype.iterator.Employee;
import com.pattern.behaviortype.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company {
	
	private List<Employee> list = new ArrayList<>();
	
	public CompanyMin(){
		list.add(new Employee("小民", 26, "男", "程序猿"));
		list.add(new Employee("小芸", 22, "女", "测试"));
		list.add(new Employee("小方", 18, "女", "测试"));
		list.add(new Employee("可儿", 21, "女", "设计"));
		list.add(new Employee("朗情", 19, "女", "设计"));
	}

	@Override
	public Iterator iterator() {
		return new MinIterator(list);
	}
}
