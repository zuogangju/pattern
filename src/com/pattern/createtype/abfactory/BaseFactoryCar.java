package com.pattern.createtype.abfactory;

/**
 * Description: 抽象工厂
 *
 * @author zuogangju
 * @date 2019/3/4 14:56
 * @version V1.0
 */
public abstract class BaseFactoryCar {
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
