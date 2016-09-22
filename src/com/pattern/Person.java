package com.pattern;

public class Person {
	public String name = "default name";
	public int[] array = new int[10];

	public Person() {
		System.out.println("加载无参数构造函数:"+name);
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	@SuppressWarnings("unused")
	private Person(String name) {
		this.name = name;
		System.out.println("加载私有构造函数:"+name);
	}

	public void fun() {
		System.out.println("我是无参数方法fun");
	}

	public void fun(String name) {
		System.out.println("我是有参数方法"+name);
	}

}
