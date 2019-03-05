package com.pattern.createtype.factory;
/**
 * Description: 创建型-->工厂方法模式
 *
 * @author zuogangju
 * @date 2019/3/4 13:52
 * @version V1.0
 */
public class Client {
	public static void main(String[] args) {
		BaseFactory baseFactory = new FactoryConcrete();
		BaseProduct baseProductB = baseFactory.createProduct(ProductBConcrete.class);
		baseProductB.method();

		BaseProduct baseProductA = baseFactory.createProduct(ProductAConcrete.class);
		baseProductA.method();
	}
}
