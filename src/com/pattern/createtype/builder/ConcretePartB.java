package com.pattern.createtype.builder;

/**
 * Description: 具体部件B
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 14:28
 */
public class ConcretePartB implements Part {
    @Override
    public void method() {
        System.out.println("生产PartB");
    }
}