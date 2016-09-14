package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: NormalBrake
* @Description: 制动系统实现类
* @author zuozuo
* @date 2016年9月14日 上午11:45:40
 */
public class BrakeNormal implements Brake{
	@Override
	public void brake() {
		System.out.println("普通制动");
	}
}
