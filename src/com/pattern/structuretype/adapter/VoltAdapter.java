package com.pattern.structuretype.adapter;

/**
 * 
 * @ClassName: VoltAdapter
 * @Description: 类适配器模式
 * @author zuozuo
 * @date 2016年9月14日 上午10:43:47
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

	@Override
	public int getVolt5() {
		return 5;
	}

}
