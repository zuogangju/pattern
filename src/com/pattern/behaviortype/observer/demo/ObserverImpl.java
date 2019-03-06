package com.pattern.behaviortype.observer.demo;

/**
 * Description: 观察者实现
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 10:39
 */
public class ObserverImpl implements Observer {

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "," + msg + "更新了");
    }
}
