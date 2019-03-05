package com.pattern.createtype.builder;

/**
 * Description: LeaderDirector 类，负责制造
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 14:32
 */
public class Director {

    private Builder builder;

    /**
     * 将部件partA partB partC最后组成复杂对象
     *
     * @param builder 建造者对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 这里是将车轮 方向盘和发动机组装成汽车的过程
     */
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}