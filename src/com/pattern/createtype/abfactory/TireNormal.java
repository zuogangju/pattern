package com.pattern.createtype.abfactory;
/**
 * Description: 普通轮胎实现类
 *
 * @author zuogangju
 * @date 2019/3/4 14:54
 * @version V1.0
 */
public class TireNormal implements Tire{
	@Override
	public void tire() {
		System.out.println("普通轮胎");
	}
}
