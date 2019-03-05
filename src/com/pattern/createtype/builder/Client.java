package com.pattern.createtype.builder;

/**
 * Description: 创建型-->建造者模式
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 14:22
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
//        Product product = builder.getResult();

    }
}
