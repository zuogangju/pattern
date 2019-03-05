package com.pattern.structuretype.adapter;

/**
 * Description: 对象适配器模式
 *
 * @author zuogangju
 * @date 2019/3/4 15:32
 * @version V1.0
 */
public class VoltAdapter1 implements FiveVolt {

	Volt220 mVolt220;

	public VoltAdapter1(Volt220 adaptee) {
		this.mVolt220 = adaptee;
	}

	public int getVolt220() {
		return mVolt220.getVolt220();
	}

	@Override
	public int getVolt5() {
		return 5;
	}

}
