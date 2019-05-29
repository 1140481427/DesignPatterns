package com.hjiaxin.factorymethod;

public class Main {

    public static void main(String[] args) {
        Moveable m = new CarFactory().createCat();
        m.go();
    }
}
