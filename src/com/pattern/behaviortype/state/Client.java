package com.pattern.behaviortype.state;
/**
 * Description: 行为型-->状态模式
 * 
 * @author zuogangju
 * @date 2019/3/6 15:06
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		TVController tvController = new TVController();
		//设置开机状态
		tvController.powerOn();
		//下一频道
		tvController.nextChannel();
		//调高音量
		tvController.turnUp();
		//关机
		tvController.powerOff();
		//调低音量，此时不会生效
		tvController.turnDown();
	}
}
