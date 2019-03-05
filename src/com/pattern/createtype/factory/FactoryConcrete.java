package com.pattern.createtype.factory;

/**
 * Description: 具体工厂
 *
 * @author zuogangju
 * @date 2019/3/4 13:53
 * @version V1.0
 */
public class FactoryConcrete extends BaseFactory {
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends BaseProduct> T createProduct(Class<T> clz) {
		BaseProduct baseProduct = null;
		try {
			baseProduct = (BaseProduct) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) baseProduct;
	}
}
