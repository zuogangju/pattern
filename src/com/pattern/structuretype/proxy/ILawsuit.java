package com.pattern.structuretype.proxy;
/**
 * Description: 被代理者接口
 *
 * @author zuogangju
 * @date 2019/3/4 15:42
 * @version V1.0
 */
public interface ILawsuit {

	/**
	 * 提交申请
	 */
	void submit();
	
	/**
	 * 进行举证
	 */
	void burden();
	
	/**
	 * 开始辩护
	 */
	void defend();
	
	/**
	 * 诉讼完成
	 */
	void finish();
}
