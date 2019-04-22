package com.org.design.factoryMethod;

import com.org.design.factoryMethod.factory.FactoryBMW320;
import com.org.design.factoryMethod.factory.FactoryBMW523;
import com.org.design.factoryMethod.product.BMW320;
import com.org.design.factoryMethod.product.BMW523;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:52
 */
public class TestClient {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
