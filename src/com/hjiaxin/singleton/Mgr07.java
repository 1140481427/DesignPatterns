package com.hjiaxin.singleton;

/**
 * 比较完美的版本
 * 静态内部类的方式
 * 内部类 保证 对象唯一    jvm保证类唯一 就是所谓的线程安全
 */
public class Mgr07 {

    private Mgr07(){}

    /**
     * Mgr07 在被加载的时候 不会 加载内部类   当调用到内部类属性时 才加载
     */
    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->//java 8  因为 需要传的对象 只存在一个方法 可以简写为以下内容
                System.out.println(Mgr07.getInstance().hashCode())
            ).start();
        }
    }
}
