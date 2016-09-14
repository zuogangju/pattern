package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: SeniorBrake
* @Description: 高级制动实现类
* @author zuozuo
* @date 2016年9月14日 上午11:46:02
 */
public class BrakeSenior implements Brake{
	@Override
	public void brake() {
		System.out.println("高级制动");
	}
}
