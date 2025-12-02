package com.academy.three;

import java.util.Scanner;

/**
 *
 */
public class ArithmeticDemo extends RuntimeException {
    public static void main(String[] args) {
        System.out.println("Dobro došli u sistem");
        System.out.println("Unesite prvi broj");
           int number1=new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj");
           int number2=new Scanner(System.in).nextInt();

           int suma =number1+number2;
        System.out.println("suma ="+suma);



    }
}
