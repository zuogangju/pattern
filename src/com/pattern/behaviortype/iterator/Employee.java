package com.pattern.behaviortype.iterator;

import java.util.StringJoiner;

/**
 * Description: 员工
 *
 * @author zuogangju
 * @date 2019/3/5 9:17
 * @version V1.0
 */
public class Employee {
	/**
	 *  姓名
	 */
	private String name;
	/**
	 *  年龄
	 */
	private int age;
	/**
	 *  性别
	 */
	private String sex;
	/**
	 *  职位
	 */
	private String position;
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



	public Employee(String name, int age, String sex, String position) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.position = position;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("age=" + age)
				.add("sex='" + sex + "'")
				.add("position='" + position + "'")
				.toString();
	}
}
