package com.org.design;

/**
 * @version 1.0
 * @Description:懒汉线程安全
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:56
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){
    }
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
