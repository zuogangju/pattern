package com.pattern.structuretype.adapter;

/**
 * 
 * @ClassName: Test
 * @Description: 结构型-->类适配器模式
 * @author zuozuo
 * @date 2016年9月14日 上午11:54:31
 */
public class Client {

	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter();
		System.out.println("输出电压：" + adapter.getVolt5());// 调用接口中的方法

		Volt220 v = new Volt220();
		VoltAdapter1 adapter1 = new VoltAdapter1(v);
		System.out.println(adapter1.getVolt5());
	}

}
