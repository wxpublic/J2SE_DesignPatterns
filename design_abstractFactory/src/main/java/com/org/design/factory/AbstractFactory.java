package com.org.design.factory;

import com.org.design.product.cpu.Cpu;
import com.org.design.product.mainboard.Mainboard;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 2:57
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}