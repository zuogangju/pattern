package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: AFactory
* @Description: A工厂
* @author zuozuo
* @date 2016年9月14日 上午10:45:35
 */
public class AFactory extends CarFactory{

	@Override
	public ITire createTire() {
		return new NormalTire();
	}

	@Override
	public IEngine createEngine() {
		return new DomesticEngine();
	}

	@Override
	public IBrake createBrake() {
		return new NormalBrake();
	}
}
