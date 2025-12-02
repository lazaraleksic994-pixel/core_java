package com.academy.three;

import java.util.Scanner;

public class andiliordemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj1");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite broj2");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Number2"+number2);
        if((number1 ==23) && (number2++ <10)) {
            System.out.println("Michael Jordan i neki fudbaler");
        }
        System.out.println("Number1"+number2);
        if ((number1==23) || (number2<10))
            System.out.println("ili je Michael Jordan ili je neki fudbaler");

        {
        }
    }

}