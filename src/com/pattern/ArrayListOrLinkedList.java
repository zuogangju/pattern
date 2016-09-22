package com.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @ClassName: Test
 * @Description: 反射：加载类的字节码
 * @author zuozuo
 * @date 2016年9月19日 上午10:40:57
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
public class ArrayListOrLinkedList {
	public static void main(String[] args) throws Exception {
		// 加载类的3种方法
		refGetClass();

		// 获取并调用无参构造函数
		refGetPublicConstructor();

		// 获取并调用私有的含参构造函数
		refGetPrivateConstructor();

		// 获取并调用无参方法 fun
		refGetMethodWithNoArg();

		// 获取并调用有参数方法 fun
		refGetMethodWithArg();

		// 获取类的字段
		refGetField();
		
		// arraylist和linkedlist对比
		testPerformance();

	}
	/**
	 * 
	 * @Title: refGetField
	 * @Description: 获取类的字段
	 * @throws Exception
	 *             void 返回类型
	 */
	private static void refGetField() throws Exception {
		Class clazz = Class.forName("com.pattern.Person");
		Constructor c = clazz.getDeclaredConstructor(new Class[] { String.class });
		// 由于构造函数是 private 的，所以需要获取控制权限
		c.setAccessible(true);
		Person p = (Person) c.newInstance(new Object[] { "I'm a reflect name!" });
		Field f = clazz.getField("name");
		Object value = f.get(p);
		Class type = f.getType();
		System.out.println(type);
		if (type.equals(String.class)) {
			System.out.println((String) value);
		}
		System.out.println();
	}

	/**
	 * 
	 * @Title: refGetMethodWithArg
	 * @Description: 获取并调用有参数方法 fun
	 * @throws Exception
	 *             void 返回类型
	 */
	private static void refGetMethodWithArg() throws Exception {
		Class clazz = Class.forName("com.pattern.Person");
		Constructor c = clazz.getConstructor();
		Person p = (Person) c.newInstance();
		Method method = clazz.getMethod("fun", new Class[] { String.class });
		method.invoke(p, new Object[] { "I'm a reflect method!" });
		System.out.println();
	}

	/**
	 * 
	 * @Title: refGetMethodWithNoArg
	 * @Description: 获取并调用无参方法 fun
	 * @throws Exception
	 *             void 返回类型
	 */
	private static void refGetMethodWithNoArg() throws Exception {
		Class clazz = Class.forName("com.pattern.Person");
		Constructor c = clazz.getConstructor();
		Person p = (Person) c.newInstance();
		Method method = clazz.getMethod("fun");
		method.invoke(p);
		System.out.println();
	}

	/**
	 * 
	 * @Title: refGetPrivateConstructor
	 * @Description: 获取并调用私有的含参构造函数
	 * @throws Exception
	 *             void 返回类型
	 */
	private static void refGetPrivateConstructor() throws Exception {
		Class clazz = Class.forName("com.pattern.Person");
		Constructor c = clazz.getDeclaredConstructor(new Class[] { String.class });
		// 由于构造函数是 private 的，所以需要屏蔽Java语言的访问检查
		c.setAccessible(true);
		Person p = (Person) c.newInstance(new Object[] { "I'm a reflect name!" });
		System.out.println();
	}

	/**
	 * 
	 * @Title: refGetPublicConstructor
	 * @Description: 获取并调用无参构造函数
	 * @throws Exception
	 *             void 返回类型
	 */

	private static void refGetPublicConstructor() throws Exception {
		Class clazz = Class.forName("com.pattern.Person");// 获取类
		Constructor c = clazz.getConstructor();// 获取构造函数
		Person p = (Person) c.newInstance();// 类实例化
		System.out.println();
	}

	/**
	 * 
	 * @Title: refGetClass
	 * @Description: 加载类的3种方法
	 * @throws ClassNotFoundException
	 *             void 返回类型
	 */
	private static void refGetClass() throws ClassNotFoundException {
		// 加载类的3种方法
		Class clazz = Class.forName("com.pattern.Person");
		System.out.println("1.Class.forName:" + clazz.getCanonicalName());
		Class clazz1 = new Person().getClass();
		System.out.println("2.new Person().getClass():" + clazz.getCanonicalName());
		Class class2 = Person.class;
		System.out.println("3.Person.class:" + clazz.getCanonicalName());
		System.out.println();
	}

	public static void testPerformance() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		int times = 10 * 1000;
		 times = 100 * 1000;
//		 times = 1000 * 1000;
		System.out.println("Test times = " + times);
		System.out.println("-------------------------");
		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < times; i++) {
//			arrayList.add(i);
			arrayList.add(0, i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration + " <--ArrayList add");

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < times; i++) {
//			linkedList.add(i);
			linkedList.addFirst(i);;
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(duration + " <--LinkedList add");
		System.out.println("-------------------------");
		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < times; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(duration + " <--ArrayList get");

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < times; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(duration + " <--LinkedList get");
		System.out.println("-------------------------");

		// ArrayList remove
		startTime = System.nanoTime();
		for (int i = times - 1; i >= 0; i--) {
			arrayList.remove(0);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(duration + " <--ArrayList remove");

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = times - 1; i >= 0; i--) {
//			linkedList.remove(i);
			linkedList.removeFirst();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println(duration + " <--LinkedList remove");
	}
}
