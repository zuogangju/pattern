package com.pattern.structuretype.bridge;
/**
 * Description: 大杯咖啡实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:12
 * @version V1.0
 */
public class LargeCoffee extends Coffee{

	public LargeCoffee(BaseCoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("大杯的" + impl.addSomething() + "咖啡");
	}

}
