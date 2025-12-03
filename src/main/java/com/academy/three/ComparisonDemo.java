package com.academy.three;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("unesite broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite broj");
        int number2 = new Scanner(System.in).nextInt();
        if (number1==number2){
            System.out.println("brojevi su jednaki");
        }
        if (number1!=number2){
            System.out.println("brojevi su različiti");
        }
        if (number1>number2){}
    }
}
