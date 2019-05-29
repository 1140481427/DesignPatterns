package com.hjiaxin.factorymethod;

/**
 * 简单工程 可扩充性低
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
