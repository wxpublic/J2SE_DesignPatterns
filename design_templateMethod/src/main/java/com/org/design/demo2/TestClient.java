package com.org.design.demo2;

/**
 * @version 1.0
 * @Description: https://blog.csdn.net/carson_ho/article/details/54910518
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 5:27
 */
public class TestClient {
    public static void main(String[] args) {
        //炒 - 手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒 - 蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
