package com.magic.generics;

public class findMaximum {
    public static <T extends Comparable<T>> T maximum(T first,T second,T third) {
        T max =first;
        if(second.compareTo(first)>0){
            max = second;
        }
        if(third.compareTo(max)>0){
            max = third;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(maximum(89,67,101));
    }
}

