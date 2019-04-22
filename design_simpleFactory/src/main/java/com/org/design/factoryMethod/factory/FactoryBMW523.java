package com.org.design.factoryMethod.factory;

import com.org.design.factoryMethod.product.BMW523;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:52
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}
