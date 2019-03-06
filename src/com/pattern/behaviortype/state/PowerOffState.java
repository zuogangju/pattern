package com.pattern.behaviortype.state;

/**
 * Description: 关机状态，操作无结果
 *
 * @author zuogangju
 * @date 2019/3/6 15:09
 * @version V1.0
 */
public class PowerOffState implements TVState{

	@Override
	public void nextChannel() {
		
	}

	@Override
	public void prevChannel() {
		
	}

	@Override
	public void turnUp() {
		
	}

	@Override
	public void turnDown() {
		
	}
}
