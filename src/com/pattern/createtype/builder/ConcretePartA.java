package com.pattern.createtype.builder;

/**
 * Description: 具体部件A
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 14:26
 */
public class ConcretePartA implements Part {
    @Override
    public void method() {
        System.out.println("生产PartA");
    }
}
