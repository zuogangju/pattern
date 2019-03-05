package com.pattern.structuretype.adapter;

/**
 * Description: 类适配器模式
 *
 * @author zuogangju
 * @date 2019/3/4 15:27
 * @version V1.0
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

	@Override
	public int getVolt5() {
		return 5;
	}

}
