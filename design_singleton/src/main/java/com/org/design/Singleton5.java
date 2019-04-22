package com.org.design;

/**
 * @version 1.0
 * @Description:静态内部类
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:56
 */
public class Singleton5 {
    private Singleton5(){
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder {
        private static final Singleton5 sInstance = new Singleton5();
    }
}
