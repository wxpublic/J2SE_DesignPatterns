package com.org.design;

import com.org.design.strategyClass.AdvancedMemberStrategy;
import com.org.design.strategyClass.MemberStrategy;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 5:12
 */
public class TestClient {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        //创建环境
        ContextPrice price = new ContextPrice(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
