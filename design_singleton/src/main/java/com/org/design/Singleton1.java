package com.org.design;

/**
 * @version 1.0
 * @Description:「饿汉式」
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:55
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1 (){
    }
    public static Singleton1 getInstance() {
        return instance;
    }
}
