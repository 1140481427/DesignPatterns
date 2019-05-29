package com.hjiaxin.singleton;

/**
 * lazy loading
 * 懒汉式
 *缺点 线程不安全
 *
 *
 */
public class Mgr05 {

    private Mgr05(){}

    private static Mgr05 INSTANCE;

    public static Mgr05 getInstance() {
        if(INSTANCE == null) {
            //妄图通过同步代码块方式提高效率  然后 导致了不安全
            synchronized(Mgr05.class){
                try{
                    Thread.sleep(1);//使问题更明显
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            INSTANCE = new Mgr05();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->//java 8  因为 需要传的对象 只存在一个方法 可以简写为以下内容
                System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }
    }
}
