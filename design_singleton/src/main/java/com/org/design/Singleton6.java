package com.org.design;

/**
 * @version 1.0
 * @Description: 枚举单例：使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 5:03
 * 枚举单例的优点就是简单，但是大部分应用开发很少用枚举，可读性并不是很高，不建议用
 */
public enum Singleton6 {
    //定义一个枚举的元素，它就是 Singleton 的一个实例
    INSTANCE;
    public void doSomeThing() {
    // do something...
    }

    public static void main(String args[]) {
        Singleton6 singleton = Singleton6.INSTANCE;
        singleton.doSomeThing();
    }
}
