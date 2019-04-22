package com.org.design.simpleFactory;

import com.org.design.factoryMethod.product.BMW;
import com.org.design.factoryMethod.product.BMW320;
import com.org.design.factoryMethod.product.BMW523;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:45
 */
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}
