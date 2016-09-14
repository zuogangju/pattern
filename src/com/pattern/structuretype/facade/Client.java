package com.pattern.structuretype.facade;
/**
 * 
* @ClassName: Client
* @Description: 结构型-->外观模式
* @author zuozuo
* @date 2016年9月14日 下午3:00:07
 */
public class Client {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		
		//拍照
		mobilePhone.takePicture();
		//视频聊天
		mobilePhone.videoChat();
	}

}
