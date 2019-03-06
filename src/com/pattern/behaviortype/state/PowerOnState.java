package com.pattern.behaviortype.state;

/**
 * Description: 开机状态，操作有效
 *
 * @author zuogangju
 * @date 2019/3/6 15:09
 * @version V1.0
 */
public class PowerOnState implements TVState{

	@Override
	public void nextChannel() {
		System.out.println("下一频道");
	}

	@Override
	public void prevChannel() {
		System.out.println("上一频道");
	}

	@Override
	public void turnUp() {
		System.out.println("调高音量");
	}

	@Override
	public void turnDown() {
		System.out.println("调低音量");
	}
}
