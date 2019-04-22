package com.org.design;

/**
 * @version 1.0
 * @Description:懒汉非线程安全
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:56
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){
    }
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
