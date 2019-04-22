package com.org.design;

/**
 * @version 1.0
 * @Description: https://www.cnblogs.com/java-my-life/archive/2012/05/16/2502279.html
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:32
 */
public class userClient {
    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }
}
