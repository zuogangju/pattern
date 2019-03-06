package com.pattern.behaviortype.state;

/**
 * Description: 电视遥控器
 *
 * @author zuogangju
 * @date 2019/3/6 15:07
 * @version V1.0
 */
public class TVController implements PowerController{

	private TVState mTVState;
	
	public void setTVState(TVState mTVState){
		this.mTVState = mTVState;
	}
	
	@Override
	public void powerOn() {
		setTVState(new PowerOnState());
		System.out.println("开机了");
	}

	@Override
	public void powerOff() {
		setTVState(new PowerOffState());
		System.out.println("关机了");
	}
	
	public void nextChannel(){
		mTVState.nextChannel();
	}
	
	public void prevChannel(){
		mTVState.prevChannel();
	}
	
	public void turnUp(){
		mTVState.turnUp();
	}
	
	public void turnDown(){
		mTVState.turnDown();
	}
}
