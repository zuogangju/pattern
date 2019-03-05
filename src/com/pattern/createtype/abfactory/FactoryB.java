package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: BFactory
* @Description: B工厂
* @author zuozuo
* @date 2016年9月14日 上午10:45:22
 */
public class FactoryB extends BaseFactoryCar {

	@Override
	public Tire createTire() {
		return new TireSUV();
	}

	@Override
	public Engine createEngine() {
		return new EngineImport();
	}

	@Override
	public Brake createBrake() {
		return new BrakeSenior();
	}
}
