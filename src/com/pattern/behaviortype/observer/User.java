package com.pattern.behaviortype.observer;

/**
 * Description: 具体的观察者类，也就是订阅者
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/4 16:31
 */
public class User implements Observer {
    /**
     * 订阅者的名字
     */
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "," + message + "更新了！");

    }


}
