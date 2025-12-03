package com.academy.array;

import java.util.Arrays;

public class arraycopyofDemo {
    public static void main(String[] args) {
        char[] copyFrom= {'d','e','c','a','f','f','e','t','i','n','a','t','e','d'};
        char[]  copyTo= Arrays.copyOfRange( copyFrom,2,10);
        System.out.println(copyTo);


    }
}
