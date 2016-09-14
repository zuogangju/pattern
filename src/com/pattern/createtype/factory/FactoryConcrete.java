package com.pattern.createtype.factory;

/**
 * 
 * @ClassName: ConcreteFactory
 * @Description: 具体工厂类
 * @author zuozuo
 * @date 2016年9月14日 下午4:05:01
 */
public class FactoryConcrete extends Factory {
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> clz) {
		Product product = null;
		try {
			product = (Product) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}
}
