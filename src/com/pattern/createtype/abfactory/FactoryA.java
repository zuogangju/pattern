package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: AFactory
* @Description: A工厂
* @author zuozuo
* @date 2016年9月14日 上午10:45:35
 */
public class FactoryA extends FactoryCar{

	@Override
	public Tire createTire() {
		return new TireNormal();
	}

	@Override
	public Engine createEngine() {
		return new EngineDomestic();
	}

	@Override
	public Brake createBrake() {
		return new BrakeNormal();
	}
}
