package com.pattern.behaviortype.observer.demo;

/**
 * Description: TODO（这里用一句话描述这个类的作用）
 *
 * @author zuogangju
 * @version V1.0
 * @date 2019/3/6 10:40
 */
public class Client {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        Observer observer = new ObserverImpl("小明");
        Observer observer2 = new ObserverImpl("小王");
        observable.register(observer);
        observable.register(observer2);
        observable.push("xxx电视剧");
    }
}
