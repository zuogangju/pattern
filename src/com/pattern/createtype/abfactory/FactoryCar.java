package com.pattern.createtype.abfactory;

/**
 * 
 * @ClassName: CarFactory
 * @Description: 抽象工厂
 * @author zuozuo
 * @date 2016年9月14日 上午10:44:50
 */
public abstract class FactoryCar {
	/**
	 * 生产轮胎
	 * 
	 * @return 轮胎
	 */
	public abstract Tire createTire();

	/**
	 * 生产发动机
	 * 
	 * @return 发动机
	 */
	public abstract Engine createEngine();

	/**
	 * 生产制动系统
	 * 
	 * @return 制动系统
	 */
	public abstract Brake createBrake();

}
