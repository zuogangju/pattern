package com.pattern.createtype.abfactory;
/**
 * Description: 高级制动实现类
 *
 * @author zuogangju
 * @date 2019/3/4 14:56
 * @version V1.0
 */
public class BrakeSenior implements Brake{
	@Override
	public void brake() {
		System.out.println("高级制动");
	}
}
