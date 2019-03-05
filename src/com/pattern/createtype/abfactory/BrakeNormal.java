package com.pattern.createtype.abfactory;
/**
 * Description: 普通制动系统实现
 *
 * @author zuogangju
 * @date 2019/3/4 14:56
 * @version V1.0
 */
public class BrakeNormal implements Brake{
	@Override
	public void brake() {
		System.out.println("普通制动");
	}
}
