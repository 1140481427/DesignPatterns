package com.hjiaxin.factorymethod;

/**
 * 各自交通工具工厂  处理各自的生产逻辑
 */
public class CarFactory {

    public Moveable createCat(){
        //中间是生产汽车需要的规则 或者 中间条件
        return new Car();
    }
}
