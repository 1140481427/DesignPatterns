package com.hjiaxin.strategy;

public class Cat implements Comparable<Cat>{

    int width;
    int height;

    public Cat(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int compareTo(Cat c){
        if(c.width > this.width) {
            return -1;
        } else if (c.width < this.width) {
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "Cat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}
