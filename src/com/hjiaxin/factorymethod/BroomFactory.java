package com.hjiaxin.factorymethod;

/**
 * 各自交通工具工厂  处理各自的生产逻辑
 */
public class BroomFactory {

    public Moveable createBroom(){
        //中间是生产 需要的规则 或者 中间条件
        return new Broom();
    }
}
