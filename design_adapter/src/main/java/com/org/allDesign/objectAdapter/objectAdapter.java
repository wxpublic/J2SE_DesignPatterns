package com.org.allDesign.objectAdapter;

import com.org.allDesign.basic.PS2;
import com.org.allDesign.basic.USB;

/**
 * @version 1.0
 * @Description:对象适配器模式
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 4:12
 */
public class objectAdapter implements PS2{

    private USB usb;

    public objectAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    public void isPS2() {
        usb.isUsb();
    }
}
