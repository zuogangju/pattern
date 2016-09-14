package com.pattern.behaviortype.Iterator;

public class Employee {

	private String name;// 姓名
	private int age;// 年龄
	private String sex;// 性别
	/**  
	* @return name  
	*/
	public String getName() {
		return name;
	}

	/**  
	* @param name 要设置的 name  
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**  
	* @return age  
	*/
	public int getAge() {
		return age;
	}

	/**  
	* @param age 要设置的 age  
	*/
	public void setAge(int age) {
		this.age = age;
	}

	/**  
	* @return sex  
	*/
	public String getSex() {
		return sex;
	}

	/**  
	* @param sex 要设置的 sex  
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**  
	* @return position  
	*/
	public String getPosition() {
		return position;
	}

	/**  
	* @param position 要设置的 position  
	*/
	public void setPosition(String position) {
		this.position = position;
	}

	private String position;// 职位

	public Employee(String name, int age, String sex, String position) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.position = position;
	}

	// 简化代码，省略setter和getter方法

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", sex="
				+ sex + ", position='" + position + '\'' + "}";
	}
}
