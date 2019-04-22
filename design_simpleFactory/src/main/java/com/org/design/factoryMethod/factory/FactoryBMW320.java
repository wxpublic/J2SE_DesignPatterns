package com.org.design.factoryMethod.factory;

import com.org.design.factoryMethod.product.BMW320;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:50
 */
public class FactoryBMW320 implements FactoryBMW{

    @Override
    public BMW320 createBMW() {

        return new BMW320();
    }

}
