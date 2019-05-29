package com.hjiaxin.singleton;

/**
 * lazy loading
 * 懒汉式
 * 老版本比较完美的单例模式
 *
 *
 */
public class Mgr06 {

    private Mgr06(){}

    private static volatile Mgr06 INSTANCE;//JIT

    public static Mgr06 getInstance() {
        if(INSTANCE == null) {
            synchronized (Mgr06.class) {
                //双重检查机制
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);//使问题更明显
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->//java 8  因为 需要传的对象 只存在一个方法 可以简写为以下内容
                System.out.println(Mgr06.getInstance().hashCode())
            ).start();
        }
    }
}
