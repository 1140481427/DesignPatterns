package com.hjiaxin.singleton;

/**
 * 单例模式1
 * 饿汉式
 * 缺点 未调用前就提前加载
 * 不用的时候就会提前加载
 */
public class Mgr01 {

    private Mgr01(){}

    private static final Mgr01 INSTANCE = new Mgr01();

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
