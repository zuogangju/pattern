package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: NormalTire
* @Description: 轮胎实现类
* @author zuozuo
* @date 2016年9月14日 上午11:45:51
 */
public class TireNormal implements Tire{
	@Override
	public void tire() {
		System.out.println("普通轮胎");
	}
}
