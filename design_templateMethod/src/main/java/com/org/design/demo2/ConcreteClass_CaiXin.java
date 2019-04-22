package com.org.design.demo2;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-04-22 下午 5:24
 */
public class ConcreteClass_CaiXin extends AbstractParent{
    @Override
    public void pourVegetable(){
        System.out.println("下锅的蔬菜是菜心");
    }
    @Override
    public void pourSauce(){
        System.out.println("下锅的酱料是蒜蓉");
    }
}
