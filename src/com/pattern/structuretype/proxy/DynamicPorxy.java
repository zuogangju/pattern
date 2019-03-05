package com.pattern.structuretype.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * Description: 动态代理
 *
 * @author zuogangju
 * @date 2019/3/4 15:45
 * @version V1.0
 */
public class DynamicPorxy implements InvocationHandler {
    /**
     * 被代理类的引用
     */
    private Object obj;

    public DynamicPorxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // 调用被代理类对象的方法
        Object result = method.invoke(obj, args);
        return result;
    }

}
