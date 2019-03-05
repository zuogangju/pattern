package com.pattern.createtype.factory;

/**
 * Description: 抽象工厂
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 13:53
 */
public abstract class BaseFactory {
    /**
     * 生产产品-抽象工厂方法(具体由子类实现)
     *
     * @param clz 产品对象类类型
     * @return 具体的产品对象
     */
    public abstract <T extends BaseProduct> T createProduct(Class<T> clz);
}
