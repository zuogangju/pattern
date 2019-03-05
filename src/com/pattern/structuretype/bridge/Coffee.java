package com.pattern.structuretype.bridge;

public abstract class Coffee{
	
	protected BaseCoffeeAdditives impl;

	public Coffee(BaseCoffeeAdditives impl) {
		this.impl = impl;
	}
	
	/**
	 * 咖啡具体什么样由子类决定 
	 */
	public abstract void makeCoffee();
}