package com.pattern.structuretype.adapter;

/**
 * Description: 结构型-->类适配器模式
 *
 * @author zuogangju
 * @date 2019/3/4 15:26
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		VoltAdapter adapter = new VoltAdapter();
		// 调用接口中的方法
		System.out.println("输出电压：" + adapter.getVolt5());

		Volt220 v = new Volt220();
		VoltAdapter1 adapter1 = new VoltAdapter1(v);
		System.out.println("输出电压："+adapter1.getVolt5());
	}

}
