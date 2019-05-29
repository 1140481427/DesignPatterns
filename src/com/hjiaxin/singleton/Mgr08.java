package com.hjiaxin.singleton;

/**
 * 最完美版本
 * 枚举单例
 */
public enum Mgr08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->//java 8  因为 需要传的对象 只存在一个方法 可以简写为以下内容
                System.out.println(Mgr08.INSTANCE.hashCode())
            ).start();
        }
    }
}
