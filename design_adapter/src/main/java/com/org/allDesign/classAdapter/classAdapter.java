package com.org.allDesign.classAdapter;

import com.org.allDesign.basic.PS2;
import com.org.allDesign.basic.Usber;

/**
 * @version 1.0
 * @Description: 类适配器模式
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:09
 */
public class classAdapter extends Usber implements PS2 {
    @Override
    public void isPS2() {
        isUsb();
    }
}
