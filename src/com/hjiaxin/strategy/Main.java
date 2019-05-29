package com.hjiaxin.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] arr = [0,6,3,7,9];
       // int[] arr = {0,6,3,7,9};
        Cat c1 = new Cat(1,6);
        Cat c2 = new Cat(2,2);
        Cat c3 = new Cat(3,3);
        Cat[] c = new Cat[3];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
       /* Dog d = new Dog(7);
        Dog d1 = new Dog(2);
        Dog d2 = new Dog(4);
        Dog[] dArr = new Dog[3];
        dArr[0] = d;
        dArr[1] = d1;
        dArr[2] = d2;*/
        Sorter<Cat> s = new Sorter<Cat>();
        //s.sort(c,new CatHeightComparator());
        //s.sort(c,new CatWidthComparator());
        s.sort(c,(o1,o2)->{
            if(o1.width > o2 .width) return -1;
            else if(o1.width < o2.width) return 1;
            return 0;
        });

        System.out.println(Arrays.toString(c));
    }
}
