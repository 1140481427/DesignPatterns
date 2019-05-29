package com.hjiaxin.strategy;

/**
 * 比较器
 * @param <T>
 */
public interface Comparator<T> {

    int compare(T o1, T o2);
}
