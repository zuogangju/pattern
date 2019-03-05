package com.pattern.structuretype.facade;
/**
 * Description: 结构型-->外观模式
 *
 * @author zuogangju
 * @date 2019/3/4 16:06
 * @version V1.0
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
