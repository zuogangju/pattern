package com.pattern.structuretype.bridge;
/**
 * Description: 小杯咖啡实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:12
 * @version V1.0
 */
public class SmallCoffee extends Coffee{

	public SmallCoffee(BaseCoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("小杯的" + impl.addSomething() + "咖啡");
	}
}
