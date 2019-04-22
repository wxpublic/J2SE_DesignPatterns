package com.org.allDesign.classAdapter;

import com.org.allDesign.basic.PS2;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:11
 */
public class testClass {
    public static void main(String[] args) {
        PS2 ps2 = new classAdapter();
        System.out.print("PS2接口适配完成,输出：");
        ps2.isPS2();
    }
}
