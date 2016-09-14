package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: SUVTire
* @Description: 轮胎实现类
* @author zuozuo
* @date 2016年9月14日 上午11:46:26
 */
public class SUVTire implements ITire{
	@Override
	public void tire() {
		System.out.println("越野轮胎");
	}
}
