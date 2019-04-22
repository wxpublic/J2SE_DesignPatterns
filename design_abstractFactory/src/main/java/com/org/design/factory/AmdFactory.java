package com.org.design.factory;

import com.org.design.product.cpu.Cpu;
import com.org.design.product.cpu.IntelCpu;
import com.org.design.product.mainboard.IntelMainboard;
import com.org.design.product.mainboard.Mainboard;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 2:57
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }

}