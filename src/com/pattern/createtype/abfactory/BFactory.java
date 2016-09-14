package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: BFactory
* @Description: B工厂
* @author zuozuo
* @date 2016年9月14日 上午10:45:22
 */
public class BFactory extends CarFactory{

	@Override
	public ITire createTire() {
		return new SUVTire();
	}

	@Override
	public IEngine createEngine() {
		return new ImportEngine();
	}

	@Override
	public IBrake createBrake() {
		return new SeniorBrake();
	}
}
