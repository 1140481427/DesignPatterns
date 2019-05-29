package com.hjiaxin.singleton;

/**
 * lazy loading
 * 懒汉式
 *缺点 线程不安全
 */
public class Mgr03 {

    private Mgr03(){}

    private static Mgr03 INSTANCE;

    public static Mgr03 getInstance() {
        if(INSTANCE == null) {
            try{
                Thread.sleep(1);//使问题更明显
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->//java 8  因为 需要传的对象 只存在一个方法 可以简写为以下内容
                System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}
