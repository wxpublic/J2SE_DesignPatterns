package com.org.design;

/**
 * @version 1.0
 * @Description:双重校验锁（DCL）
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:56
 */
public class Singleton4 {

    /**
     * 注意此处使用的关键字 volatile，
     * 被volatile修饰的变量的值，将不会被本地线程缓存，
     * 所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
     */
    private volatile static Singleton4 singleton;
    private Singleton4() {
    }
    public static Singleton4 getInstance() {
        if (singleton == null) {
            synchronized(Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
