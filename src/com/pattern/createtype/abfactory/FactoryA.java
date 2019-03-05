package com.pattern.createtype.abfactory;
/**
 * Description: A工厂
 *
 * @author zuogangju
 * @date 2019/3/4 14:57
 * @version V1.0
 */
public class FactoryA extends BaseFactoryCar {

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
