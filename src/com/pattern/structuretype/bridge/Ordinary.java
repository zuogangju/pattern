package com.pattern.structuretype.bridge;
/**
 * Description: 原味咖啡实现类
 *
 * @author zuogangju
 * @date 2019/3/4 16:10
 * @version V1.0
 */
public class Ordinary extends BaseCoffeeAdditives {

	@Override
	public String addSomething() {
		return "原味";
	}

}
