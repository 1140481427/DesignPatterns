package com.hjiaxin.strategy;

public class CatWidthComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.width < o2.width) {
            return -1;
        } else if(o1.width > o2.width) {
            return 1;
        } else {
            return 0;
        }

    }
}

