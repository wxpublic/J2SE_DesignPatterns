package com.org.design.staticProxy;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:37
 */
public class userClient {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();  //代理者代替真实者做事情
    }

}
