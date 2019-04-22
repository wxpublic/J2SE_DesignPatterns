package com.org.allDesign.objectAdapter;

import com.org.allDesign.basic.PS2;
import com.org.allDesign.basic.Usber;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:13
 */
public class testClass {
    public static void main(String[] args) {
        PS2 ps2_1 = new objectAdapter(new Usber());
        System.out.print("PS2接口适配完成,输出：");
        ps2_1.isPS2();
    }
}
